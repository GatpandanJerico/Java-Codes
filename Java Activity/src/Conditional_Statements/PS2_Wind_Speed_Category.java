/*
2.	Wind Speed Category. Create a program that implement the following using multi-alternative if statement. Assume that the wind speed is given as an integer.
below 25 - not a strong wind
25-38 - strong wind
39-54 - gale
55-72 - whole gale
Above 72 – hurricane
*/

package Conditional_Statements;

import java.util.Scanner;

public class PS2_Wind_Speed_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int windSpeed;

        System.out.print("Wind Speed: ");
        windSpeed = sc.nextInt();

        if (windSpeed < 25) {
            System.out.println("not strong wind");
        }
        else if (windSpeed >= 25 && windSpeed <= 38) {
            System.out.println("strong wind");
        }
        else if (windSpeed >= 39 && windSpeed <= 54) {
            System.out.println("gale");
        }
        else if (windSpeed >= 55 && windSpeed <= 72) {
            System.out.println("whole gale");
        }
        else if (windSpeed > 72) {
            System.out.println("hurricane");
        }
    }
}
