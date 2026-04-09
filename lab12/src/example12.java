public class example12 {
    public static void main(String[] args) {
        String sentence = "Это простой тест для проверки самого длинного слова";
        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Самое длинное слово: " + longest);
    }
}
