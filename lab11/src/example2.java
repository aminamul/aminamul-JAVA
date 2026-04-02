import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Число 1: ");
            double a = sc.nextDouble();

            System.out.print("Число 2: ");
            double b = sc.nextDouble();

            System.out.print("Операция: ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '*': System.out.println(a * b); break;
                case '/': System.out.println(b != 0 ? a / b : "Ошибка"); break;
            }

            System.out.print("Еще? (yes/no): ");
            repeat = sc.next();

        } while (repeat.equalsIgnoreCase("yes"));
    }
}