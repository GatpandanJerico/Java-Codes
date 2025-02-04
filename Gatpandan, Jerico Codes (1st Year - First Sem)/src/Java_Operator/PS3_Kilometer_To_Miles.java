package Java_Operator;/*

3.	Kilometers to miles. Create a program that ask user for distance in kilometers. Then, output distance in miles. Note that, 1 km is equivalent to 0.6214 miles.

*/

import java.util.Scanner;

public class PS3_Kilometer_To_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kilometers;
        double miles = 0.6214;
        double result;

        System.out.print("Kilometers: ");
        kilometers = sc.nextInt();

        result = kilometers * miles;

        System.out.println(kilometers + " kilometers" + " = " + formatNumber(result) + " miles");

    }

    private static String formatNumber(double number) {
        return (number % 1 == 0) ? String.format("%.0f", number) : String.format("%.2f", number);
    }
}
