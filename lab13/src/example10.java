import java.util.List;

public class example10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(); // современный способ

        int min = list.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}