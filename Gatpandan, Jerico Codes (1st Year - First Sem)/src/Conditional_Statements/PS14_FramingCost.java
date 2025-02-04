/*
14.	Framing Cost. You have several pictures of different sizes that you would like to frame. A local picture framing store offers two types of frames - regular and fancy. The frames are available in white and can be ordered in any color the customer desires. Suppose that each frame is 1 inch wide. The cost of coloring the frame is $0.10 per inch. The cost of the regular frame is $0.15 per inch and the cost of a fancy frame is $0.25 per inch. The cost of putting a cardboard paper behind the picture is $0.02 per square inch and the cost of putting glass on top of the picture is $0.07 per square inch. The customer can also choose to put crowns on the corners, which costs $0.35 per crown.

Write a program that prompts the user to input the following information and then output the cost of framing the picture:
a.	the length and width, in inches, of the picture
b.	the type of the frame
c.	customer’s choice of color to color the frame
d.	if the user wants to add the crowns, then the number of crowns

 */
package Conditional_Statements;

import java.util.Objects;
import java.util.Scanner;

public class PS14_FramingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 0;
        float regularFrameCost = 0.15f; //per inch
        float fancyFrameCost = 0.25f; //per inch
        float crownCost = 0.35f;
        float cardBoardPaperCost = 0.02f; //perSquareInch
        float glassCost = 0.07f; //perSquareInch

        System.out.print("Length(inch): ");
        int length = sc.nextInt();

        System.out.print("Width(inch): ");
        int width = sc.nextInt();

        sc.nextLine();

        System.out.print("Frame Type(Regular or Fancy): ");
        String frameType = sc.nextLine().toLowerCase();

        System.out.print("Customer's Color Choice? ");
        String customerColorChoice = sc.nextLine();

        System.out.print("Number of Crown: ");
        int numberOfCrown = sc.nextInt();

        float area = length * width; // inch squared
        float perimeter = (length + width) * 2; // inches

        if (frameType.equals("regular")) {
            float colorCost = 0;
            if (customerColorChoice.equals("yes")) {
                colorCost = 0.10f * perimeter;
            }
            total = (regularFrameCost * perimeter) + (crownCost * numberOfCrown) + colorCost + (cardBoardPaperCost * area) + (glassCost * area);
        } else if (frameType.equals("fancy")) {
            float colorCost = 0;
            if (customerColorChoice.equals("yes")) {
                colorCost = 0.10f * perimeter;
            }

            total = (fancyFrameCost * perimeter) + (crownCost * numberOfCrown) + colorCost + (cardBoardPaperCost * area) + (glassCost * area);
        }

        System.out.println("\nTotal Cost: $" + total);

    }
}
