import javax.swing.*;
import java.awt.*;

public class example8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example8");

        JTextField a = new JTextField(5);
        JTextField b = new JTextField(5);
        JButton btn = new JButton("+");
        JLabel res = new JLabel();

        btn.addActionListener(e -> {
            int x = Integer.parseInt(a.getText());
            int y = Integer.parseInt(b.getText());
            res.setText("Result: " + (x + y));
        });

        f.setLayout(new FlowLayout());
        f.add(a);
        f.add(b);
        f.add(btn);
        f.add(res);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}