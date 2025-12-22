package practice12.practice12_1;


// доп задание кнопка перезапускаает прогу


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    private MShape[] shapes;
    private JPanel drawingPanel; // Выносим панель для рисования в поле класса

    public Window() {
        setTitle("Random Shapes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создаем фигуры
        shapes = Rand(20);

        // Панель для рисования
        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());

                for (MShape shape : shapes) {
                    shape.draw(g);
                }
            }
        };

        // Кнопка перезапуска
        JButton restartButton = new JButton("Перезапуск");
        restartButton.setFont(new Font("Arial", Font.BOLD, 14));
        restartButton.setBackground(new Color(70, 130, 180));
        restartButton.setForeground(Color.WHITE);

        // Добавляем обработчик для кнопки
        restartButton.addActionListener(e -> {
            // Генерируем новые фигуры
            shapes = Rand(20);
            // Перерисовываем панель
            drawingPanel.repaint();
            System.out.println("Программа перезапущена!");
        });

        // Панель для кнопки (чтобы она была по центру внизу)
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(restartButton);

        // Устанавливаем менеджер компоновки
        setLayout(new BorderLayout());
        add(drawingPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private MShape[] Rand(int cnt) {
        Random random = new Random();
        MShape[] shapes = new MShape[cnt];

        for (int i = 0; i < cnt; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int x = random.nextInt(700);
            int y = random.nextInt(500);

            if (random.nextBoolean()) {
                int r = 15 + random.nextInt(50);
                shapes[i] = new Circle(color, x, y, r);
            } else {
                int a = 25 + random.nextInt(70);
                int b = 25 + random.nextInt(70);
                shapes[i] = new MRectangle(color, x, y, a, b);
            }
        }

        return shapes;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Window().setVisible(true);
        });
    }
}