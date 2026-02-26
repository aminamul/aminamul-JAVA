import java.util.Scanner;

public class example3 {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Максимум (int): " + max(a, b));

        System.out.print("Введите два числа с плавающей точкой: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("Максимум (double): " + max(x, y));

        scanner.close();
    }
}
