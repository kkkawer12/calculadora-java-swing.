package com.calculator.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField displayField;
    private String currentInput = "";
    private String previousInput = "";
    private char operator = ' ';
    private boolean newInput = true;

    public CalculatorGUI() {
        setTitle("Calculadora Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.BOLD, 32));
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5)); // Rows, Cols, Hgap, Vgap

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "C", "+",
            "", "", "", "=" // Empty strings for layout, or could add more features
        };

        for (String label : buttonLabels) {
            if (label.isEmpty()) {
                buttonPanel.add(new JLabel("")); // Placeholder
            } else {
                JButton button = new JButton(label);
                button.setFont(new Font("Arial", Font.BOLD, 18));
                button.addActionListener(this);
                buttonPanel.add(button);
            }
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            if (newInput) {
                currentInput = command;
                newInput = false;
            } else {
                currentInput += command;
            }
            displayField.setText(currentInput);
        } else if (command.equals("C")) {
            currentInput = "";
            previousInput = "";
            operator = ' ';
            newInput = true;
            displayField.setText("");
        } else if (command.equals("=")) {
            if (!previousInput.isEmpty() && operator != ' ') {
                double result = calculate();
                displayField.setText(String.valueOf(result));
                previousInput = String.valueOf(result);
                currentInput = "";
                newInput = true;
                // operator = ' '; // Keep operator for chained operations or clear it
            }
        } else { // Operator (+, -, *, /)
            if (!currentInput.isEmpty()) {
                if (!previousInput.isEmpty() && operator != ' ') {
                    // Perform previous calculation if an operator is already set
                    double result = calculate();
                    previousInput = String.valueOf(result);
                    displayField.setText(previousInput);
                } else {
                    previousInput = currentInput;
                }
                currentInput = "";
                operator = command.charAt(0);
                newInput = true;
            }
        }
    }

    private double calculate() {
        double num1 = Double.parseDouble(previousInput);
        double num2 = Double.parseDouble(currentInput.isEmpty() ? "0" : currentInput); // Handle case where currentInput might be empty before hitting equals again
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    displayField.setText("Erro: Divisão por zero");
                    return 0; // Or throw an exception
                }
                break;
        }
        return result;
    }
}

