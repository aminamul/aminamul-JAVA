import javax.swing.*;
import java.awt.*;

public class example2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example2");
        JButton btn = new JButton("Click");
        JLabel label = new JLabel();

        btn.addActionListener(e -> label.setText("Hello Java"));

        f.setLayout(new FlowLayout());
        f.add(btn);
        f.add(label);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}