package Java_Operator;/*

6.	Arithmetic Operations. Create a program that ask the user for 2 input numbers. Then print the added result, subtracted, multiplied and divided. In that order.
Input: 1 2
Output: 3 -1 2 0


*/

import java.util.Scanner;

public class PS6_Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int added, subtracted, multiplied, divided;

        System.out.print("Input: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        added = num1 + num2;
        subtracted = num1 - num2;
        multiplied = num1 * num2;

        System.out.print("Output: " + added + " " + subtracted + " " + multiplied + " ");
        if (num2 == 0) {
            System.out.print("Invalid for division");
            return;
        }
        divided = num1 / num2;
        System.out.print(divided);

    }
}
