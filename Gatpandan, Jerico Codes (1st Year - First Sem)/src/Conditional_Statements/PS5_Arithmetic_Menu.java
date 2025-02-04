package Conditional_Statements;/*
5.	Arithmetic Menu. Write a program that will compute the arithmetic operation according to the
choice of the user.

ARITHMETIC MENU
A. Addition
B. Subtraction
C. Multiplication
D. Division
E. Modulus
F. Quit

Enter a selection: A
Input two operands: 1 2
Result: 1 + 2 = 3
*/


import java.util.Scanner;

public class PS5_Arithmetic_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float operand1, operand2;
        System.out.print("ARITHMETIC MENU\n" +
                "A. Addition\n" +
                "B. Subtraction\n" +
                "C. Multiplication\n" +
                "D. Division\n" +
                "E. Modulus\n" +
                "F. Quit\n" + "\nEnter a Selection: ");
        String selection = sc.next().toUpperCase();

        if (selection.equals("F")) {
            return;
        }

        System.out.print("Input two operands: ");
        operand1 = sc.nextInt();
        operand2 = sc.nextInt();



        switch (selection) {
            case "A":
                addition(operand1,operand2);
                break;
            case "B":
                subtraction(operand1, operand2);
                break;
            case "C":
                multiplication(operand1, operand2);
                break;
            case "D":
                division(operand1, operand2);
                break;
            case "E":
                modulos(operand1, operand2);
                break;
            default:
        }

    }

    private static void modulos(float operand1, float operand2) {
        System.out.println(formatNumber(operand1) + " % " + formatNumber(operand2) + " = " + formatNumber(operand1 % operand2));
    }

    private static String formatNumber(float number) {
        return (number % 1 == 0) ? String.format("%.0f", number) : String.format("%.2f", number);
    }

    // Method to perform addition
    private static void addition(float operand1, float operand2) {
        System.out.println(formatNumber(operand1) + " + " + formatNumber(operand2) + " = " + formatNumber(operand1 + operand2));
    }

    // Method to perform subtraction
    private static void subtraction(float operand1, float operand2) {
        System.out.println(formatNumber(operand1) + " - " + formatNumber(operand2) + " = " + formatNumber(operand1 - operand2));
    }

    // Method to perform multiplication
    private static void multiplication(float operand1, float operand2) {
        System.out.println(formatNumber(operand1) + " * " + formatNumber(operand2) + " = " + formatNumber(operand1 * operand2));
    }

    // Method to perform division
    private static void division(float operand1, float operand2) {
        if (operand2 == 0) {
            System.out.println("Invalid. Cannot divide by zero. ");
            return;
        }
        System.out.println(formatNumber(operand1) + " / " + formatNumber(operand2) + " = " + formatNumber(operand1 / operand2));
    }
}
