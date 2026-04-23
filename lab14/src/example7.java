public class example7 {
    public static void main(String[] args) {

        int number;

        do {
            number = (int)(Math.random() * 10);
            System.out.println(number);
        } while (number != 0);

        System.out.println("Стоп");
    }
}