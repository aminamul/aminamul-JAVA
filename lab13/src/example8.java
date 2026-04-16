import java.util.Arrays;

public class example8 {
    public static void main(String[] args) {
        Arrays.asList("hello", "programming", "java")
                .stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}