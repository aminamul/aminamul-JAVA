import java.util.Arrays;

public class example18 {
    public static void main(String[] args) {
        Arrays.asList(1,1,2,2,3,3,4)
                .stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}