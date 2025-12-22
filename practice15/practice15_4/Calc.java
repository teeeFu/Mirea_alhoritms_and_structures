package practice15.practice15_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame implements ActionListener {
    private JTextField display;
    private double firstNumber, secondNumber, result;
    private String operator;
    private boolean errorDisplayed;

    public Calc() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        mainPanel.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();


        if (errorDisplayed && (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals("."))) {
            display.setText("");
            errorDisplayed = false;
        }

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals(".")) {

            String currentText = display.getText();
            if (!currentText.contains(".")) {
                display.setText(currentText + ".");
            }

        } else if (command.equals("=")) {
            calculateResult();
        } else {
            if (!display.getText().isEmpty()) {
                firstNumber = Double.parseDouble(display.getText());
                operator = command;
                display.setText("");
            }
        }
    }

    private void calculateResult() {
        if (operator != null && !display.getText().isEmpty()) {
            secondNumber = Double.parseDouble(display.getText());

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        display.setText("Ошибка");
                        errorDisplayed = true;
                        return;
                    }
                    break;
            }

            if (!errorDisplayed) {
                if (result == (int) result) {
                    display.setText(String.valueOf((int) result));
                } else {
                    display.setText(String.valueOf(result));
                }
            }

            operator = null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calc());
    }
}