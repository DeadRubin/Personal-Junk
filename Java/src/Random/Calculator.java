import java.awt.*;
import javax.swing.*;

public class Calculator {

    static double num1 = 0;
    static String operator = "";

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1, 5, 5));

        // 🟢 Input field
        JTextField input = new JTextField();
        input.setFont(new Font("Arial", Font.PLAIN, 18));

        // 🔵 Result field
        JTextField result = new JTextField();
        result.setFont(new Font("Arial", Font.BOLD, 18));
        result.setEditable(false);

        // 🟡 Buttons panel
        JPanel panel = new JPanel(new GridLayout(1, 5));

        String[] ops = {"+", "-", "*", "/", "="};

        for (String op : ops) {
            JButton btn = new JButton(op);

            btn.addActionListener(e -> {

                try {
                    double value = Double.parseDouble(input.getText());

                    // If operator
                    if (!op.equals("=")) {
                        num1 = value;
                        operator = op;
                        input.setText(""); // clear for next number
                    }

                    // If equals
                    else {
                        double num2 = value;
                        double res = 0;

                        switch (operator) {
                            case "+": res = num1 + num2; break;
                            case "-": res = num1 - num2; break;
                            case "*": res = num1 * num2; break;
                            case "/": res = num2 != 0 ? num1 / num2 : 0; break;
                        }

                        result.setText(String.valueOf(res));
                    }

                } catch (Exception ex) {
                    result.setText("Invalid input");
                }
            });

            panel.add(btn);
        }

        frame.add(input);
        frame.add(panel);
        frame.add(result);

        frame.setVisible(true);
    }
}