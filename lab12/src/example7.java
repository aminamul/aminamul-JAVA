public class example7 {
    public static void main(String[] args) {
        String input = "А роза упала на лапу Азора";
        String clean = input.replaceAll("\\s+", "").toLowerCase(); // убираем пробелы и делаем нижний регистр

        boolean isPalindrome = clean.equals(new StringBuilder(clean).reverse().toString());
        System.out.println("Строка является палиндромом? " + (isPalindrome ? "Да" : "Нет"));
    }
}