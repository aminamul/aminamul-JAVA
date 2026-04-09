public class example13 {
    public static void main(String[] args) {
        String input = "Это тестовая строка";
        int count = input.replace(" ", "").length();
        System.out.println("Количество символов без пробелов: " + count);
    }
}