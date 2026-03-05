public class example16 {

    public static int maxX(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 101 - 50); // [-50,50]
        }

        System.out.print("Массив A: ");
        for (int num : A) System.out.print(num + " ");
        System.out.println("\nМаксимальный элемент массива: " + maxX(A));
    }
}
