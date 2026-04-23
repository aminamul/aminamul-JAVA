import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int max = 0;

        do {
            int digit = number % 10;

            if (digit > max) {
                max = digit;
            }

            number /= 10;
        } while (number > 0);

        System.out.println("Максимальная цифра: " + max);
    }
}