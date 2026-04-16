import java.util.Arrays;

public class example7 {
    public static void main(String[] args) {
        Arrays.asList("java", "stream")
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);
    }
}