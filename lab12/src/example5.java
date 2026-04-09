public class example5 {
    public static void main(String[] args) {
        String sentence = "Это простой тест для поиска слова";
        String wordToFind = "тест";

        boolean contains = sentence.contains(wordToFind);
        if (contains) {
            System.out.println("Строка содержит слово: " + wordToFind);
        } else {
            System.out.println("Слово не найдено");
        }
    }
}