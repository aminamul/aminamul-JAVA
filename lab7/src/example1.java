public class example1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;
        System.out.print("Массив A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 41 - 20); // [-20, 20]
            System.out.print(A[i] + " ");
            if (A[i] < 0) sum += A[i];
        }
        System.out.println("\nСумма отрицательных элементов: " + sum);
    }
}