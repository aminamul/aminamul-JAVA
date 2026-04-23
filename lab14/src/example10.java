import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE;

        do {
            System.out.println("Введите число (0 для выхода):");
            number = scanner.nextInt();

            if (number != 0 && number < min) {
                min = number;
            }

        } while (number != 0);

        System.out.println("Минимальное: " + min);
    }
}