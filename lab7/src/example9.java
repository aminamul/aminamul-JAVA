public class example9 {
    public static void main(String[] args) {
        double[][] C = new double[5][5];

        System.out.println("Массив C[5][5]:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = Math.random() * 20 - 10;
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        double product = 1;
        boolean hasPositive = false;
        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }
        if (!hasPositive) product = 0;

        System.out.println("Произведение положительных элементов главной диагонали: " + product);
    }
}