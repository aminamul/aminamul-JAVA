public class example3 {
    public static void main(String[] args) {
        String sentence = "Это простой тест для подсчёта слов";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);
    }
}