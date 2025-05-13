public class main {
    package com.calculator.main;

import javax.swing.SwingUtilities;
import com.calculator.gui.CalculatorGUI;

    public class Main {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new CalculatorGUI().setVisible(true);
                }
            });
        }
    }


}
