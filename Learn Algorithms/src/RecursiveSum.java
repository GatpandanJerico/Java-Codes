/*
 * Sum of Natural Numbers (Recursive Algorithm)
Write a function that computes the sum of all natural numbers from 1 to n using a recursive algorithm. Compare the recursive solution with an iterative solution and discuss the differences.
 */
public class RecursiveSum {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(recursiveSum(n));
        System.out.println(iterativeSum(n));

    }

    private static int recursiveSum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    private static int iterativeSum(int n) {
        return n * (n + 1) / 2;
    }
}