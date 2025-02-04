package Java_Operator;/*
5.	Volume of a Cylinder. Create a program capable of computing the volume of a cylinder. To find the volume of a cylinder, we must find the area of the base and multiply that by the height. Remember that the area of a circle (the base is a circle) is Pi x radius2. Volume = ∏r2h
*/

import java.util.Scanner;

public class PS5_Volume_Of_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double Pi = 3.14159265359;
        double radius,height,volume;  // height in centimeters


        System.out.print("Radius: ");
        radius = sc.nextDouble();

        System.out.print("Height: ");
        height = sc.nextInt();

        volume = Pi * radius * radius * height;

        System.out.println("Volume = " + formatNumber(volume) + "cm\u00b3");

    }
    private static String formatNumber(double number) {
        return (number % 1 == 0) ? String.format("%.0f", number) : String.format("%.2f", number);
    }
}
