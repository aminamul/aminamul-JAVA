import javax.swing.*;
import java.awt.*;

public class example3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example3");

        JTextField tf = new JTextField(10);
        JButton btn = new JButton("OK");
        JLabel label = new JLabel();

        btn.addActionListener(e -> {
            label.setText("Привет, " + tf.getText());
        });

        f.setLayout(new FlowLayout());
        f.add(tf);
        f.add(btn);
        f.add(label);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}