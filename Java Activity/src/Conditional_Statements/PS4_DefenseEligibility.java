/*
4.	The Department of Defense would like a program that identifies single males between the ages 18 and 26, inclusive. Print a message if all the criteria are met.
Sample output:
Status: S
Age: 19
All criteria are met.
Status: M
Age: 19
Failed to satisfy criteria

*/
package Conditional_Statements;

import java.util.Scanner;

public class PS4_DefenseEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Status: ");
        String status = input.nextLine().toUpperCase();

        System.out.print("Age: ");
        int age = input.nextInt();

        if (status.equals("S") && (age >= 18 && age <= 26)) {
            System.out.println("All criteria are met.");
        }
        else {
            System.out.println("Failed to satisfy criteria.");
        }
    }
}
