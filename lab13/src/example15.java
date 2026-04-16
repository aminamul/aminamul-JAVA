import java.util.Arrays;

public class example15 {
    public static void main(String[] args) {
        Arrays.asList(5,2,9,1)
                .stream()
                .filter(n -> n > 2)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);
    }
}