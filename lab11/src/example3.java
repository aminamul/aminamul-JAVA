public class example3 {

    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }

    static double div(double a, double b) {
        return b != 0 ? a / b : 0;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 2));
        System.out.println(sub(5, 2));
        System.out.println(mul(5, 2));
        System.out.println(div(5, 2));
    }
}
