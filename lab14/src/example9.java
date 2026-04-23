import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password;

        do {
            System.out.println("Введите пароль (>=6 символов):");
            password = scanner.nextLine();
        } while (password.length() < 6);

        System.out.println("Пароль принят");
    }
}