package Conditional_Statements;/*

3.	Largest Number. Write a program that reads in three numbers A, B, and C and determine which is the largest.

 */

public class PS3_Largest_Number {
    public static void  main(String[] args) {
        int[] numbers = {23, 48, 32};
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest is " + largest);
    }
}
