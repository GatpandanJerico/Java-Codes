/*
9.	Ordered Number. A 4-digit number WXYZ is called an ordered number if the difference between the first two digits, WX and the last two digits, YZ, WX-YZ =1 or YZ-WX =1. For example, 1213 and 4645 are ordered no., while 2346 and 7685 are not ordered numbers
Write a program that will accept a 4-digit number and will determined if it is an ordered
number. Test your program with numbers 1213, 2345, 999 and 4645.

 */
package Conditional_Statements;

import java.util.Scanner;

public class PS9_OrderedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a 4-Digit Number: ");
            number = sc.nextInt();

            if (number < 1000 || number > 9999) {
                System.out.println("Invalid try again");
            }

        } while (number < 1000 || number > 9999);

        int firstNumber = number / 100;
        int secondNumber = number % 100;

        int difference = firstNumber - secondNumber;

        if (difference == 1 || difference == -1) {
            System.out.println(number + " is an ordered number");
        }
        else {
            System.out.println(number + " is not an ordered number");
        }


    }
}
