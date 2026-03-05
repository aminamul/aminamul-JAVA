public class example13 {
    public static void main(String[] args) {
        double[] C = new double[20];
        double sum = 0;
        System.out.print("Массив C: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = Math.random() * 20 - 10; // [-10,10]
            System.out.print(C[i] + " ");
            sum += C[i];
        }
        double average = sum / C.length;
        System.out.println("\nСреднее значение элементов массива C: " + average);
    }
}
