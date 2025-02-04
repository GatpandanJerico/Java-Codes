package Conditional_Statements;/*
* 1.	Loudness In Decibels (Db) Perception. Create a program that associate noise
*       loudness measured in decibels with the effect of the noise. The following shows the
*       relationship between noise levels and human perceptions of noises.
50 or lower - quiet
51-70 - intrusive
71-90 - annoying
91-110 - very annoying
Above 110 – uncomfortable

*
* */

import java.util.Scanner;

public class PS1_Loudness_Db_Perception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decibels;

        System.out.print("Decibels: ");
        decibels = sc.nextInt();
        sc.close();

        if (decibels <= 50) {
            System.out.println("quiet");
        }
        else if (decibels >= 51 && decibels <= 70) {
            System.out.println("intrusive");
        }
        else if (decibels >= 71 && decibels <= 90) {
            System.out.println("annoying");
        }
        else if (decibels >= 91 && decibels <= 110) {
            System.out.println("very annoying");
        }
        else if (decibels > 110) {
            System.out.println("uncomfortable");
        }


    }
}
