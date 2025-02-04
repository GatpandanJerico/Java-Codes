/*
    Name: Jerico C. Gatpandan
    Date: September 14, 2024
    Section: ACT112L-OAa
*/

import java.util.Scanner;

public class P2_GATPANDAN_JERICO_ACT112L_OAa_SEPT_14_2024 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        float operand1, operand2;
        String operator;

        // Input first number
        System.out.print("input number 1: ");
        if (input.hasNextFloat()) {
            operand1 = input.nextFloat();
        }
        else {
            System.out.println("The operation is invalid. Operands should only contain valid Whole or decimal numbers.");
            input.close();
            return;
        }

        // Input second number
        System.out.print("input number 2: ");
        if (input.hasNextFloat()) {
            operand2 = input.nextFloat();
        }
        else {
            System.out.println("The operation is invalid. Operands should only contain valid Whole or decimal numbers.");
            input.close();
            return;
        }

        input.nextLine(); // remove the \n or newline character

        System.out.println(" "); // Add spacing

        // Ask the operation to perform
        System.out.print("Operation to perform (addition, subtraction, multiplication, division): ");
        operator = input.next();
        input.close();

        // Determine the operation to perform based on the Input
        switch (operator){
            case "addition": case "+":
                addition(operand1,operand2);
                break;
            case "subtraction": case "-":
                subtraction(operand1,operand2);
                break;
            case "multiplication": case "*":
                multiplication(operand1, operand2);
                break;
            case "division": case "/":
                division(operand1,operand2);
                break;
            default:
                System.out.println("Invalid operator. Only 'addition', 'subtraction', 'multiplication', 'division' or +, -, *, / are allowed.");
        }
    }

    
    // Method to remove .0 if the number is whole and preserve the decimal if not whole number
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
