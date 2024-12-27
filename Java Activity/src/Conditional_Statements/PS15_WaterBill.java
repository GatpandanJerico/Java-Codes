/*
15.	Water Bill. Write a program that will calculate and print out bills for the city water company. The water rates vary depending on whether the water is for home use, commercial use or industrial use. A code of h means home use, a code of C means commercial use and a code of I means industrial use.

    The water rates are computed as follows:
    code h: P250 plus P2.00 per gallon used
    code c: P5000 for the first 4 million gallons and P2.00 for each additional gallon.
    code i: P5000 if usage does not exceed 4 million gallons,
    P10000 if usage is more than 4 million gallons but not more than 10 million
    gallons, and
    P15000 if usage exceeds 10 million gallons.

    Your program should prompt the user for the code and the gallons of water used.
    Your program should echo your input data and should print the amount due from the
    user. Your program should use a switch statement for the code (char data type).
    Use the float data type for the gallons.

 */
package Conditional_Statements;

import java.util.Scanner;

public class PS15_WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Code (h/c/i): ");
        String code = sc.next();

        System.out.print("Gallons Used: ");
        float gallonsUse = sc.nextFloat();

        float totalCost = 0;

        switch (code.toLowerCase()) {
            case "h":
                totalCost = 250 + (gallonsUse * 2);
                System.out.println("Code: Home use");
                break;
            case "c":
                if (gallonsUse <= 4_000_000) {
                    totalCost = 5000;
                } else {
                    totalCost = 5000 + ((gallonsUse - 4_000_000) * 2);
                }
                System.out.println("Code: Commercial use");
                break;
            case "i":
                if (gallonsUse <= 4_000_000) {
                    totalCost = 5000;
                } else if (gallonsUse <= 10_000_000) {
                    totalCost = 10000;
                } else {
                    totalCost = 15000;
                }
                System.out.println("Code: Industrial use");
                break;
            default:
                System.out.println("Invalid code. Please use 'h', 'c', or 'i'.");
                return;
        }

        System.out.println("Gallons Used: " + gallonsUse);
        System.out.println("Amount Due: P" + totalCost);
    }
}
