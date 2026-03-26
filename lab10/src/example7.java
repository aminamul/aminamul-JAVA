import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class example7 extends JPanel {

    char ch = ' ';

    public example7() {
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                ch = e.getKeyChar();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Key: " + ch, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Example7");
        example7 p = new example7();

        f.add(p);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
