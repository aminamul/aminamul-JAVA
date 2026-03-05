public class example4 {
    public static void main(String[] args) {
        double[] C = new double[25];
        double product = 1;
        boolean hasPositive = false;
        System.out.print("Массив C: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = Math.random() * 20 - 10; // [-10,10]
            System.out.print(C[i] + " ");
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }
        if (!hasPositive) product = 0;
        System.out.println("\nПроизведение положительных элементов: " + product);
    }
}
