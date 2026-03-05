public class example17 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "Test";
        String s5 = "Test";

        String result;
        if (s4.equals(s5)) {
            result = s1 + s2; // Можно изменить на s1 + s3, по условию "либо"
        } else {
            result = s1;
        }

        System.out.println("Результат объединения: " + result);
    }
}
