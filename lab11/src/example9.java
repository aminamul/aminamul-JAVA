import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 +");
        System.out.println("2 -");

        int c = sc.nextInt();

        switch (c) {
            case 1: System.out.println("Сложение"); break;
            case 2: System.out.println("Вычитание"); break;
        }
    }
}