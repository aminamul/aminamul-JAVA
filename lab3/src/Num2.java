import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();

        double sum = x + y;
        double product = x * y;
        double division = x / y;

        System.out.println("Сложение: " + sum);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + division);
    }
}
