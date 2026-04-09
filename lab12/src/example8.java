public class example8 {
    public static void main(String[] args) {
        String str1 = "Привет мир";
        String str2 = "привет мир";

        if (str1.equals(str2)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }

        // Игнорируя регистр
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Строки равны без учёта регистра");
        }
    }
}
