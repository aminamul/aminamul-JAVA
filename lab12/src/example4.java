public class example4 {
    public static void main(String[] args) {
        String sentence = "Это простой тест";
        String[] words = sentence.split("\\s+");
        System.out.print("Слова в обратном порядке: ");
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.print(reversed + " ");
        }
        System.out.println();
    }
}