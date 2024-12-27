/*
10.	BMI Weight Status. Write a program that calculates the user’s body mass index (BMI) and categorizes it as underweight, normal, overweight, or obese, based on the following table from the United States Centers for Disease Control:

Below 20.9 underweight
21.0 – 35.9 normal
36.0 – 45.9 overweight
46.0	and above obese

Prompt the user to enter weight in pounds and height in inches

 */
package Conditional_Statements;

import java.util.Scanner;

public class PS10_BMI_WeightStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight(pounds) : ");
        float weight = sc.nextFloat();

        System.out.print("Height(inches): ");
        float height = sc.nextFloat();

        float BMI = (weight * 703) / (height * height);
        System.out.println("BMI = " + BMI);


        if (BMI < 20.9) {
            System.out.println("underweight");
        }
        else if (BMI >= 21.0 && BMI <= 35.9) {
            System.out.println("normal");
        }
        else if (BMI >= 36.0 && BMI <= 45.9) {
            System.out.println("overweight");
        } else if (BMI >= 46.0) {
            System.out.println("obese");
        }

    }
}
