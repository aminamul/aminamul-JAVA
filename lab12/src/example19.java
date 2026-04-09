import java.util.*;

public class example19 {
    public static void main(String[] args) {
        String input = "Тестовая строка";
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Частота символов:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}