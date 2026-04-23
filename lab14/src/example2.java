import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Количество цифр: " + count);
    }
}