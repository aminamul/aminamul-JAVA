public class example5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;
        System.out.print("Массив D: ");
        for (int i = 0; i < D.length; i++) {
            D[i] = Math.random() * 20 - 10; // [-10,10]
            System.out.print(D[i] + " ");
            sum += D[i];
        }
        double average = sum / D.length;
        System.out.println("\nСреднее арифметическое: " + average);
    }
}
