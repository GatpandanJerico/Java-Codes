/*
7.	Type of Angle. An Acute angle is less than 90 degrees, an obtuse angle is greater than 90 degrees, and a right angle is equal to 90 degrees. Using this information, write a program that accepts an angle, in degrees, and displays the type of angle corresponding to the degrees entered.
 */
package Conditional_Statements;

import java.util.Scanner;

public class PS7_TypeOfAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the degrees of the angle: ");
        int angle = sc.nextInt();

        if (angle < 90) {
            System.out.println("The angle is Acute");
        }
        else if (angle > 90) {
            System.out.println("The angle is Obtuse");
        }
        else {
            System.out.println("The angle is Right angle");
        }
    }
}
