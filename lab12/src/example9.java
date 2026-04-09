public class example9 {
    public static void main(String[] args) {
        String sentence = "Это простой тест для разделения строки";
        String[] words = sentence.split("\\s+"); // разделяем по пробелу

        System.out.println("Разделённые слова:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}