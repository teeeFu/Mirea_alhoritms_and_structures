package practice15.practice15_2;

import practice12.practice12_1.MShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class menu {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showBar();
            }
        });
    }

    public static void showBar() {
        JFrame frame = new JFrame("app");

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        String[] countries = {"Russia","Germany","France","USA"};
        JComboBox<String> comboBox = new JComboBox<>(countries);

        panel.add(comboBox);
        frame.add(panel);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                @SuppressWarnings("unchecked")
                JComboBox<String> cb = (JComboBox<String>) e.getSource();
                String selectedCountry = (String) cb.getSelectedItem();
                if (Objects.equals(selectedCountry, "Russia")) {
                    selectedCountry = selectedCountry + " - многонациональное государство,\n\t\t\t\t" +
                            "расположенное в Восточной Европе и Северной Азии.\n\t\t\t\t" +
                            "Два крупнейших города страны — Москва и Санкт-Петербург.\n\t\t\t\t" +
                            "Столица — Москва.";
                }
                if (Objects.equals(selectedCountry, "Germany")) {
                    selectedCountry = selectedCountry + " - государство в Центральной Европе.\n\t\t\t\tСтолица — Берлин. ";
                }
                if (Objects.equals(selectedCountry, "USA")) {
                    selectedCountry = selectedCountry + " - государство в Северной Америке площадью в 9,8 млн км².\n\t\t\t\tСтолица - Вашингтон";
                }
                if (Objects.equals(selectedCountry, "France")) {
                    selectedCountry = selectedCountry + " - государство в Западной Европе,\n\t\t\t\t" +
                            "включающее основную территорию и ряд заморских регионов и территорий,\n\t\t\t\t" +
                            "расположенных на других континентах. Столица - Париж";
                }
                System.out.println("Выбрана страна: " + selectedCountry);
            }
        });
    }




}