package Conditional_Statements;
//8.	Cartesian Plane. Write a program that takes the (x, y) coordinates
//      of a point in the Cartesian plane and prints a message telling either an axis
//      on which the point lies or the quadrant on which it is found.
//
//
//      Sample lines of output:
//        (-1.0, -2.5) is in quadrant III
//        (0.0, 4.8) is on the y axis
//        (0.0,0.0) is at the origin


import java.util.Scanner;

public class PS8_Cartesian_Plane {
    public static void main(String[] args) {
        // 1. Start
        Scanner sc = new Scanner(System.in);
        float x, y;

        // 2. Get the input x and y
        System.out.print("x: ");
        x = sc.nextFloat();

        System.out.print("y: ");
        y = sc.nextFloat();

        sc.close();

        // 3. determine what is the quadrant
        if (x > 0 && y > 0) {
            System.out.println(("(" + x + ", " + y + ") " + "is in quadrant I"));
        }
        else if (x < 0 && y > 0) {
            System.out.println(("(" + x + ", " + y + ") " + "is in quadrant II"));
        }
        else if (x < 0 && y < 0) {
            System.out.println(("(" + x + ", " + y + ") " + "is in quadrant III"));
        }
        else if (x > 0 && y < 0) {
            System.out.println(("(" + x + ", " + y + ") " + "is in quadrant IV"));
        }
        else if (x == 0 && (y > 0 || y < 0)) {
            System.out.println(("(" + x + ", " + y + ") " + "is in y axis"));
        }
        else if ((x > 0 || x < 0) && y == 0) {
            System.out.println(("(" + x + ", " + y + ") " + "is in x axis"));
        }
        else if (x == 0 && y == 0) {
            System.out.println(("(" + x + ", " + y + ") " + "is at the origin"));
        }


    }
}
