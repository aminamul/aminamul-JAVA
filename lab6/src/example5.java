import java.util.Scanner;

public class example5 {

    public static long power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень (положительную): ");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.println("Отрицательная степень не поддерживается.");
        } else {
            long result = power(base, exponent);
            System.out.println(base + " в степени " + exponent + " = " + result);
        }

        scanner.close();
    }
}