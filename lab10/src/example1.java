import javax.swing.*;
import java.awt.*;

public class example1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 200, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Line", 50, 165);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Example1");
        f.add(new example1());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}