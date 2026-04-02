import java.util.*;

public class example8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            System.out.println(x);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
    }
}