import javax.swing.*;
import java.awt.*;

public class example9 extends JPanel {

    int x = 0;

    public example9() {
        Timer t = new Timer(50, e -> {
            x += 5;
            repaint();
        });
        t.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 30, 30);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Example9");
        f.add(new example9());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}