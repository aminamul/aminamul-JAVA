public class example17 {
    public static void main(String[] args) {
        String input = "Тест 123 с цифрами 456";
        String result = input.replaceAll("\\d", "");
        System.out.println("Строка без цифр: " + result);
    }
}