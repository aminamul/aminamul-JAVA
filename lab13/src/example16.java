import java.util.*;
import java.util.stream.Collectors;

public class example16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,21,22,23);

        Map<Integer, List<Integer>> map =
                list.stream()
                        .collect(Collectors.groupingBy(n -> n % 2));

        System.out.println(map);
    }
}