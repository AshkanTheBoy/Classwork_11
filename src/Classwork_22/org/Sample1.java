package Classwork_22.org;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample1 extends JFrame {

    private JButton button1;
    private JTextField textField1;
    private JPanel panel;
    private JLabel label;

    public Sample1(){
        setTitle("Sample1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();

    }
}
