public class example3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double product = 1;
        boolean hasNegative = false;
        System.out.print("Массив A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 20 - 10; // [-10,10]
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
        }
        if (!hasNegative) product = 0;
        System.out.println("\nПроизведение отрицательных элементов: " + product);
    }
}
