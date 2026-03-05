public class example14 {
    public static void main(String[] args) {
        int[] D = new int[30];
        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Массив D: ");
        for (int i = 0; i < D.length; i++) {
            D[i] = (int) (Math.random() * 101 - 50); // [-50,50]
            System.out.print(D[i] + " ");
            if (D[i] % 2 == 0) sumEven += D[i];
            else sumOdd += D[i];
        }

        System.out.println("\nСумма чётных элементов: " + sumEven);
        System.out.println("Сумма нечётных элементов: " + sumOdd);
    }
}