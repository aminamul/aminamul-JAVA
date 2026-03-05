import java.util.Arrays;

public class example12 {
    public static void main(String[] args) {
        int[] B = new int[25];
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 101 - 50); // [-50,50]
        }

        System.out.println("Исходный массив B: " + Arrays.toString(B));

        Arrays.sort(B);

        System.out.println("Массив B после сортировки по возрастанию: " + Arrays.toString(B));
    }
}