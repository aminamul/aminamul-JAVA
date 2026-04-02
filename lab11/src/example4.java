import javax.swing.*;
import java.awt.event.*;

public class example4 extends JFrame implements ActionListener {

    JTextField tf;
    double n1 = 0, n2 = 0, res = 0;
    char op;

    example4() {

        tf = new JTextField();
        tf.setBounds(30, 40, 220, 30);
        add(tf);

        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+"
        };

        int x = 30, y = 80;

        for (int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttons[i]);
            b.setBounds(x, y, 50, 40);
            b.addActionListener(this);
            add(b);

            x += 55;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        try {
            // ЦИФРЫ
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.equals(".")) {
                tf.setText(tf.getText() + s);
            }

            // ОПЕРАЦИИ
            else if ("+-*/".contains(s)) {
                n1 = Double.parseDouble(tf.getText());
                op = s.charAt(0);
                tf.setText(""); // очищаем для второго числа
            }

            // РАВНО
            else if (s.equals("=")) {
                n2 = Double.parseDouble(tf.getText());

                switch (op) {
                    case '+': res = n1 + n2; break;
                    case '-': res = n1 - n2; break;
                    case '*': res = n1 * n2; break;
                    case '/':
                        if (n2 != 0)
                            res = n1 / n2;
                        else {
                            tf.setText("Ошибка");
                            return;
                        }
                        break;
                }

                tf.setText(String.valueOf(res));
            }

        } catch (Exception ex) {
            tf.setText("Ошибка");
        }
    }

    public static void main(String[] args) {
        new example4();
    }
}