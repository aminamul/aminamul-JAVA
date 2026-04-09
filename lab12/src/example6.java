public class example6 {
    public static void main(String[] args) {
        String sentence = "Это простой тест для замены слова";
        String oldWord = "тест";
        String newWord = "пример";

        String replaced = sentence.replace(oldWord, newWord);
        System.out.println("Результат замены: " + replaced);
    }
}