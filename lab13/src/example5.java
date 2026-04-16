import java.util.Arrays;
import java.util.Comparator;

public class example5 {
    public static void main(String[] args) {
        int max = Arrays.asList(1,5,3,9,2)
                .stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}