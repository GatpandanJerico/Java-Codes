/*
    6.	Bob's Discount Bolts charges the following prices:
    5.25 per bolt
    30 per nut
    10.50 per washer

    Write a program that asks the user for the number of bolts, nuts, and washers in their
    purchase and then calculates and prints out the total. As an added feature, the program checks the order. It is usually a mistake if there are more bolts than nuts. In this case the program writes out "Check the Order." Otherwise the program writes out "Order is OK." In either case the total price is written out.
    SAMPLE RUN:
    Number of bolts: 12
    Number of nuts: 8
    Number of washers: 24
    Check the Order
    Total : 555.00

*/
package Conditional_Statements;

import java.util.Scanner;

public class PS6_BobsDiscountBolts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float boltPrice = 5.25f;
        final float nutPrice = 30;
        final float washerPrice = 10.50f;

        System.out.print("Number of bolts: ");
        int bolts = sc.nextInt();

        System.out.print("Number of nuts: ");
        int nuts = sc.nextInt();

        System.out.print("Number of washers: ");
        int washers = sc.nextInt();

        if (bolts > nuts) {
            System.out.println("Check the Order");
        }
        else {
            System.out.println("Order is Ok");
        }
        System.out.println("Total: " + ((bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice)));

    }

}
