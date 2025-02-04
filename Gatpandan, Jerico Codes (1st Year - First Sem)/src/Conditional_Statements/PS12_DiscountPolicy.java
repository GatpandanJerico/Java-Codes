/*
12.	Discount Policy. Keith’s Sheet Music needs a program to implement its music teacher’s discount policy.
The program is to prompt the user to enter the purchase total and to indicate whether the purchaser is a teacher.
The store plans to give each customer a printed receipt, so your program is to create a nicely formatted display output. Music teachers receive a 10% discount on their sheet music purchases unless the purchase total is $100 or higher.
In that case, the discount is 12%. The discount calculation occurs before addition of the 5% sales tax. Here are two sample output – one for a teacher and one for a non-teacher.

Total Purchases				        $122.00
Teacher’s discount (12%)		    14.64
Discounted total				    107.36
Sales tax (5%)				    	5.37
TOTAL					        	$112.73

Total Purchases				        $24.90
Sales tax (5%)				   	    1.25
TOTAL						        $26.15

 */
package Conditional_Statements;

import java.util.Scanner;

public class PS12_DiscountPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float teacherDiscount = 0.10f;
        float totalTeacherDiscount;
        float discountedTotal = 0;

        System.out.print("Total Purchase: ");
        float totalPurchase = sc.nextFloat();

        sc.nextLine();

        System.out.print("Teacher or Non-Teacher (yes/no): ");
        String teacherOrNot = sc.nextLine().toLowerCase();

        System.out.printf("\nTotal Purchases \t\t\t\t$%.2f\n", totalPurchase);

        if (totalPurchase >= 100 && teacherOrNot.equals("yes")) {
            teacherDiscount = 0.12f;
            totalTeacherDiscount = totalPurchase * teacherDiscount;
            discountedTotal = totalPurchase - totalTeacherDiscount;

            System.out.printf("Teacher's Discount (12%%)\t\t%.2f\n", totalTeacherDiscount);
            System.out.printf("Discounted Total \t\t\t\t%.2f\n", discountedTotal);
        }
        else if (teacherOrNot.equals("no")) {
            float taxPaid = totalPurchase * 0.05f;
            System.out.printf("Sales Tax (5%%)\t\t\t\t\t%.2f\n", taxPaid);

            float total = totalPurchase + taxPaid;
            System.out.printf("TOTAL\t\t\t\t\t\t\t$%.2f\n", total);
            return;

        }

        float taxPaid = discountedTotal * 0.05f;
        System.out.printf("Sales Tax (5%%)\t\t\t\t\t%.2f\n", taxPaid);

        float total = discountedTotal + taxPaid;
        System.out.printf("TOTAL\t\t\t\t\t\t\t$%.2f\n", total);



    }
}
