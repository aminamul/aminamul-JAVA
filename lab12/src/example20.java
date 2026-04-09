public class example20 {
    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "123abc";

        System.out.println(input1.matches("\\d+") ? "Да" : "Нет"); // Да
        System.out.println(input2.matches("\\d+") ? "Да" : "Нет"); // Нет
    }
}