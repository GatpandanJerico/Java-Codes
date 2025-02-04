/**
 * Name: Jerico C. Gatpandan
 * Date: September 6, 2024
 * Section: ACT112L-OAa
 */

import java.util.Scanner;

public class P1_GATPANDAN_JERICO_ACT112L_OAa_SEPT_6_2024 {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // GET Radius from the user
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // SET π = 3.14159
        final double PI = 3.14159;

        System.out.println(" "); // Add Spacing

        // Calculate the area and circumference
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        // Display the output
        System.out.println("The area is equal to " + area);
        System.out.println("The circumference is equal to " + circumference);

        scanner.close();

    }

}
