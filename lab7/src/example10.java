public class example10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];

        System.out.println("Массив D[7][7]:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = Math.random() * 20 - 10;
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }
        double average = sum / 7;

        System.out.println("Среднее арифметическое главной диагонали: " + average);
    }
}