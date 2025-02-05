public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        int accumulator = 1;
        System.out.println(factorial(n, accumulator));
    }

    // private static int factorial(int n) {
    // if (n == 0) {
    // return 1;
    // } else {
    // return n * factorial(n - 1);
    // }

    // }

    // Tail recursion
    private static int factorial(int n, int accumulator) {
        if (n == 0) {
            return accumulator;
        } else {
            return factorial(n - 1, n * accumulator);
        }

    }

}
