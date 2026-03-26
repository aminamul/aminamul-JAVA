import javax.swing.*;
import java.awt.*;

public class example10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example10");
        JPanel panel = new JPanel();

        JCheckBox red = new JCheckBox("Red");
        JCheckBox green = new JCheckBox("Green");
        JCheckBox blue = new JCheckBox("Blue");

        red.addActionListener(e -> panel.setBackground(Color.RED));
        green.addActionListener(e -> panel.setBackground(Color.GREEN));
        blue.addActionListener(e -> panel.setBackground(Color.BLUE));

        JPanel top = new JPanel();
        top.add(red);
        top.add(green);
        top.add(blue);

        f.add(top, BorderLayout.NORTH);
        f.add(panel, BorderLayout.CENTER);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}