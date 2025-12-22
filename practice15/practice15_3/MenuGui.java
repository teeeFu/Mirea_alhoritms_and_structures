package practice15.practice15_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MenuGui {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                showGUI();
            }
        });
    }

    public static void showGUI() {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");

        JTextArea textArea = new JTextArea();

        // МЕНЮ
        JMenuBar menuBar = new JMenuBar();

        // ФАЙЛ В МЕНЮ
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // ЭДИТ САТОРУ ГОДЗЕ
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        // ХЭЛП МИ ПЛС ТАМ НИЧЕГО НЕТ
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");

        helpMenu.add(aboutItem);

        menuBar.add(editMenu);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // НА ПОНЕЛЬ
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);

        frame.setJMenuBar(menuBar);
        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // ОБРАБОТЧИКИ СОБЫТИЙ ДЛЯ КНОПОК
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Кнопка 1 нажата!\n");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Кнопка 2 нажата!\n");
            }
        });

        // ОБРАБОТЧИКИ СОБЫТИЙ ДЛЯ МЕНЮ FILE
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile(textArea, frame);
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame,
                        "Вы уверены, что хотите выйти?", "Подтверждение выхода",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // ОБРАБОТЧИКИ СОБЫТИЙ ДЛЯ МЕНЮ EDIT
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
                textArea.append("Текст скопирован в буфер обмена\n");
            }
        });

        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
                textArea.append("Текст вырезан\n");
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
                textArea.append("Текст вставлен из буфера обмена\n");
            }
        });

        // ОБРАБОТЧИКИ СОБЫТИЙ ДЛЯ МЕНЮ HELP
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Мое GUI приложение\nВерсия 1.0\n© 2024",
                        "О программе",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Добавляем горячие клавиши для пунктов меню
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        exitItem.setAccelerator(KeyStroke.getKeyStroke("ctrl Q"));
        copyItem.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
        cutItem.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        pasteItem.setAccelerator(KeyStroke.getKeyStroke("ctrl V"));

        frame.add(panel);
        frame.setVisible(true);
    }

    // Метод для сохранения файла в папку с Java-файлом
    private static void saveFile(JTextArea textArea, JFrame parentFrame) {
        try {
            // Получаем путь к текущему Java-файлу
            File currentJavaFile = new File(MenuGui.class.getProtectionDomain()
                    .getCodeSource().getLocation().toURI());

            // Получаем директорию, где находится Java-файл
            File javaFileDir;
            if (currentJavaFile.isDirectory()) {
                // Если это директория (при запуске из IDE)
                javaFileDir = currentJavaFile;
            } else {
                // Если это JAR-файл (при запуске из JAR)
                javaFileDir = currentJavaFile.getParentFile();
            }

            // Создаем путь для сохранения файла
            File saveFile = new File(javaFileDir, "saved_text.txt");

            // Сохраняем текст в файл
            String textToSave = textArea.getText();
            try (FileWriter writer = new FileWriter(saveFile)) {
                writer.write(textToSave);
            }

            textArea.append("Файл сохранен: " + saveFile.getAbsolutePath() + "\n");
            JOptionPane.showMessageDialog(parentFrame,
                    "Файл успешно сохранен!\nПуть: " + saveFile.getAbsolutePath(),
                    "Сохранение",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (URISyntaxException | IOException ex) {
            textArea.append("Ошибка при сохранении файла: " + ex.getMessage() + "\n");
            JOptionPane.showMessageDialog(parentFrame,
                    "Ошибка при сохранении файла: " + ex.getMessage(),
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}