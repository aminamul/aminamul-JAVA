import javax.swing.*;
import java.awt.*;

public class example4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example4");
        JPanel panel = new JPanel();
        JButton btn = new JButton("Change Color");

        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        final int[] i = {0};

        btn.addActionListener(e -> {
            panel.setBackground(colors[i[0]]);
            i[0] = (i[0] + 1) % 3;
        });

        f.add(btn, BorderLayout.NORTH);
        f.add(panel, BorderLayout.CENTER);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}