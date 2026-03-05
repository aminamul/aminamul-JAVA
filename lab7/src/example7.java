import java.util.Arrays;

public class example7 {
    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5]; // Суммы по строкам

        System.out.println("Массив B[5][5]:");
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = (int) (Math.random() * 21 - 10); // [-10,10]
                System.out.print(B[i][j] + "\t");
                if (B[i][j] > 0) sum += B[i][j];
            }
            A[i] = sum;
            System.out.println();
        }

        System.out.println("Сумма положительных элементов по строкам: " + Arrays.toString(A));
    }
}