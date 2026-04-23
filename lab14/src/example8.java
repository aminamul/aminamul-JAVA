import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.println("Введите число (0 для выхода):");
            number = scanner.nextInt();

            sum += number;
        } while (number != 0);

        System.out.println("Сумма: " + sum);
    }
}