public class example18 {
    public static void main(String[] args) {
        String input = "Программирование";
        String replaced = input.replaceAll("(?i)[аеёиоуыэюяaeiou]", "*");
        System.out.println("Строка после замены гласных: " + replaced);
    }
}