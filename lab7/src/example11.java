import java.util.Arrays;

public class example11 {
    public static void main(String[] args) {
        int[] A = new int[25];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 101 - 50); // [-50,50]
        }

        System.out.println("Исходный массив A: " + Arrays.toString(A));

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
            if (A[i] < A[minIndex]) minIndex = i;
        }

        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;

        System.out.println("Массив после обмена максимального и минимального: " + Arrays.toString(A));
    }
}