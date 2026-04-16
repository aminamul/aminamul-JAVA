import java.util.Arrays;
import java.util.Comparator;

public class example6 {
    public static void main(String[] args) {
        Arrays.asList("Java", "Stream", "API", "Lambda")
                .stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}