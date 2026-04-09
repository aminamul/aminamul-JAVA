public class example15 {
    public static void main(String[] args) {
        String input = "Учимся программировать!";
        String endChar = "!";

        System.out.println(input.endsWith(endChar) ? "Строка заканчивается на '" + endChar + "'" : "Нет совпадения");
    }
}