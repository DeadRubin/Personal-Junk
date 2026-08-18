import java.awt.*;
import javax.swing.*;
    public class main {
        public static void main(String[] args) {

        //Frame
        JFrame CFrame = new JFrame("Simple Calculator");
        CFrame.setSize(400, 450);
        CFrame.setDefaultCloseOperation(CFrame.EXIT_ON_CLOSE);

        //Layout
        CFrame.setLayout(new BorderLayout());

        //Frame/Display
        JTextField Field = new JTextField();
        Field.setFont(new Font("Arial", Font.BOLD, 55));
        Field.setHorizontalAlignment(JTextField.RIGHT);
        Field.setEditable(false);

        CFrame.add(Field, BorderLayout.NORTH);
        //Paneel
        JPanel Panel = new JPanel();
        Panel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] Buttons = {
        "*","/","-","+",
        "9","8","7","6",
        "5","4","3","2",
        "1","0",".","=",
        "C"

        };
        for (String text : Buttons) {
            JButton btn = new JButton(text);
        // Example action
            btn.addActionListener(e -> {
            Field.setText(Field.getText() + text);

            });

        Panel.add(btn);
        }
        CFrame.add(Panel, BorderLayout.CENTER);

        CFrame.setVisible(true);
        }
    }