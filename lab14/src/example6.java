import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int count = 0;

        do {
            int digit = number % 10;

            if (digit % 2 == 0) {
                count++;
            }

            number /= 10;
        } while (number > 0);

        System.out.println("Чётных цифр: " + count);
    }
}