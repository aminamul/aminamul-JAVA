import javax.swing.*;
import java.awt.*;

public class example5 extends JPanel {

    int x = 50, y = 50;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Example5");
        example5 panel = new example5();

        JTextField xf = new JTextField(5);
        JTextField yf = new JTextField(5);
        JButton btn = new JButton("Draw");

        btn.addActionListener(e -> {
            panel.x = Integer.parseInt(xf.getText());
            panel.y = Integer.parseInt(yf.getText());
            panel.repaint();
        });

        JPanel top = new JPanel();
        top.add(xf);
        top.add(yf);
        top.add(btn);

        f.add(top, BorderLayout.NORTH);
        f.add(panel);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}