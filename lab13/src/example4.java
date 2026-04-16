import java.util.Arrays;

public class example4 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4)
                .stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}