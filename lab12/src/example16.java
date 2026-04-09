public class example16 {
    public static void main(String[] args) {
        String input = "Пример строки";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Строка в обратном порядке: " + reversed);
    }
}