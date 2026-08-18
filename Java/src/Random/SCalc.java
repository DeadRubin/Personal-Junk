import java.awt.*;
import javax.swing.*;
public class SCalc {
    static double num1 = 0;
    static String ope = "";
    public static void main(String[] args) {
        //Frame
        JFrame Calculator = new JFrame("Calculator");
        Calculator.setSize(350, 400);
        Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculator.getContentPane().setBackground(Color.WHITE);
        //Field
        JTextField Display = new JTextField();
        Display.setHorizontalAlignment(JTextField.RIGHT);
        Display.setFont(new Font("Arial", Font.ROMAN_BASELINE, 40));
        Calculator.add(Display, BorderLayout.NORTH);
        Display.setEditable(false);
        //Panel
        JPanel BLU = new JPanel(new GridLayout(5, 4, 3, 3));
        //Buttons
        String[] Btns = {"^", "%", "⌫", "/",
                        "7", "8", "9", "x",
                        "4", "5", "6", "+",
                        "1", "2", "3", "-",
                        "0", ".", "AC", "="
                        };
        for (String text : Btns) {
            JButton Button = new JButton(text);

            Color Num = Color.getHSBColor(0.217f, 0.38f, 0.22f);
            if (text.matches("[0-9.]")) {
                Button.setFont(new Font("SRICON", Font.BOLD, 32));
                Button.setBackground(Num);
                Button.setForeground(Color.white);
                Button.setContentAreaFilled(true);
            }
            else if (text.matches("AC")) {
                Button.setFont(new Font("SRICON", Font.BOLD, 32));
                Button.setBackground(Color.ORANGE);
                Button.setForeground(Color.BLACK);
                Button.setContentAreaFilled(true);
            }
            else {
                Button.setFont(new Font("SRICON", Font.BOLD, 32));
                Button.setBackground(Color.GREEN);  
                Button.setForeground(Color.BLACK);
                Button.setContentAreaFilled(true);
            }
            //Button
            Button.addActionListener(e -> {
                String value = e.getActionCommand();
                    if (value.matches("[0-9]")) {
                        Display.setText(Display.getText() + value);
                    }
                    else if (value.matches("[+\\-x/^%]")) {
                        num1  = Double.parseDouble(Display.getText());
                        ope = value;
                        Display.setText("");
                    }
                    else if (value.matches("=")) {
                        double num2 = Double.parseDouble(Display.getText());
                        double output = 0;
                        
                        switch  (ope) {
                            case "+" -> output = num1 + num2;
                            case "-" -> output = num1 - num2;
                            case "x" -> output = num1 * num2;
                            case "^" -> output = Math.pow(num1, num2);
                            case "%" -> output = num1 % num2;
                            case "/" -> {
                                if (num2 != 0) {
                                output = num1 / num2;
                                } 
                                else {
                                    Display.setText("Sigma Boy");
                                    }
                                }
                        }   
                        Display.setText(String.valueOf(output));
                    }
                    else if (value.matches(".")) {
                        Display.setText(Display.getText() + value);
                    }
                    else if (value.matches("AC")) {
                        Display.setText("");
                        num1 = 0;
                        ope = "";
                    }
            });
            JButton theme = new JButton();
            theme.setBounds(100, 20, 30, 15);
            theme.setBackground(Color.BLACK);


        BLU.add(Button);
        Calculator.add(theme);
        Calculator.add(BLU, BorderLayout.CENTER);
        Calculator.setVisible(true);
        }
    }
}