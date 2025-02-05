/*
 * Fibonacci Series (Dynamic Programming)
Write a function to calculate the nth Fibonacci number. The Fibonacci series is defined as: F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1. First, implement this using simple recursion, then optimize your function using dynamic programming to store and re-use computed values.
 */

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        HashMap<Integer, Integer> computed = new HashMap<>();
        computed.put(0, 0);
        computed.put(1, 1);

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n, computed));
    }

    private static int fibonacci(int n, HashMap<Integer, Integer> computed) {
        if (!computed.containsKey(n)) {
            computed.put(n, fibonacci(n - 1, computed) + fibonacci(n - 2, computed));
        }
        return computed.get(n);
    }
}
