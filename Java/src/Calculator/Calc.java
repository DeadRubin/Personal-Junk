import java.awt.*;
import javax.swing.*;

public class Calc {
    static double  num1 = 0;
    static String operator = "";
    public static void main(String[] args) {

        //Frame
        JFrame Display = new JFrame("Calculator");
        Display.setSize(350,450);
        Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Display.getContentPane().setBackground(Color.BLACK);
        Display.setVisible(true);

        //Field
        JTextField Field = new JTextField();
        Field.setFont(new Font("Arial", Font.BOLD, 48));
        Field.setHorizontalAlignment(JTextField.RIGHT);
        Field.setBounds(100, 100, 350, 86);
        Display.add(Field, BorderLayout.NORTH); 
        Field.setEditable(false);

        JPanel ButtonJPanel = new JPanel(new GridLayout(5, 4, 0, 0));            
        //Buttons
        String[] ops = {
            "*", "/", "-", "+",
            "9", "8", "7", "6",
            "5", "4", "3", "2",
            "1", "0", ".", "=",
            "C"
        };

        //Logic
        for (String text : ops) {
            JButton btn = new JButton(text);

            btn.setFont(new Font("Arial", Font.BOLD, 24));
            btn.setFocusPainted(false);

            //Color
            Color Col = Color.getHSBColor(0.175f, 0.03f, 0.95f);
            if (text.matches("[0-9.]")) {
                btn.setBackground(Color.WHITE);
                btn.setForeground(Color.BLACK);
                btn.setContentAreaFilled(true);
                
            }
            else if (text.matches("C")) {
                btn.setBackground(Color.WHITE);
                btn.setForeground(Color.BLACK);
                btn.setContentAreaFilled(true); 
            }
            else {
                btn.setBackground(Col);
                btn.setForeground(Color.BLACK);
                btn.setContentAreaFilled(true);
            }
            //Number
            btn.addActionListener(e -> {
                String value = e.getActionCommand();
                //If Number
                if (value.matches("[0-9]")) {
                    Field.setText(Field.getText() + value);
                }
                //If operator
                else if (value.matches("[*\\-+]")) {
                    num1 = Double.parseDouble(Field.getText());
                    operator = value;
                    Field.setText(" ");
                }
                //if equals
                else if (value.matches("=")) {
                    double num2 = Double.parseDouble(Field.getText());
                    double result = 0;
                    switch (operator) {
                        case "+" -> result = num1 + num2;
                        case "-" -> result = num1 - num2;
                        case "*" -> result = num1 * num2;
                        case "/" -> result = num2 != 0 ? num1  / num2 : 0;
                    }
                    Field.setText(String.valueOf(result));
                }
                else if (value.matches("C")) {
                    Field.setText("");
                    num1 = 0;
                    operator = "";
                }
                else if (value.matches(".")) {
                Field.setText(Field.getText() + value);
                }
            });

        ButtonJPanel.add(btn);
    Display.add(ButtonJPanel,BorderLayout.CENTER);
    Display.setVisible(true);
        }
    }
}