package Java_Operator;/*
* 4.	Perimeter of a Rectangle. Create a program responsible for computing perimeter of a rectangle.
*       For a rectangle, the dimensions of the lengths are the same and the dimensions of the widths
*       are the same. Therefore, the following formula can be used for rectangles: perimeter = 2L + 2W
*
* */

import java.util.Scanner;

public class PS4_Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        // 1. Start
        Scanner input = new Scanner(System.in);
        float length, width, perimeter;

        // 2. Get input Length and width
        System.out.print("Length: ");
        length = input.nextFloat();

        System.out.print("Width: ");
        width = input.nextFloat();

        // 3. Compute/calculate using this formula perimeter = 2L + 2W
        perimeter = 2 * (length) + 2 * (width);

        // 4. Display the result.
        System.out.println("The perimeter is " + perimeter + ".");

        // 5. End
    }
}
