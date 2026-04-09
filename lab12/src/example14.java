public class example14 {
    public static void main(String[] args) {
        String input = "Программирование на Java";
        String startWord = "Программирование";

        System.out.println(input.startsWith(startWord) ? "Строка начинается с '" + startWord + "'" : "Нет совпадения");
    }
}