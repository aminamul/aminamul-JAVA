import java.util.Arrays;

public class example8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];
        double[] prod = new double[6]; // Произведение по столбцам

        System.out.println("Массив A[12][6]:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = Math.random() * 20 - 10; // [-10,10]
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < 6; j++) {
            double p = 1;
            boolean hasNeg = false;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    p *= A[i][j];
                    hasNeg = true;
                }
            }
            prod[j] = hasNeg ? p : 0;
        }

        System.out.println("Произведение отрицательных элементов по столбцам: " + Arrays.toString(prod));
    }
}