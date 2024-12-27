/*
    11.	Call Cost. The New Telephone Company has the following rate structure for long distance calls:
    a. Any call started after 7:00PM (1900 hours) but before 8:00AM (800 hours) is  discounted 40%.
    b. Any call started after 8:00AM (800 hours) but before 7:00PM (1900 hours) is charged full.
    c. All calls are subjected to 6% tax.
    d. The regular rate for a call is P7.00 per minute.
    e. Any call longer than 60 minutes receives a 17% discount on its cost (after any other discount is subtracted but before tax is added).

    Write a program that takes the start time for a call based on a 24-hour clock (military time) and the length of the call in minutes.

    The gross cost (before any discounts or tax) should be printed followed by the net cost (after discounts are deducted and tax added).

 */

package Conditional_Statements;

import java.util.Scanner;

public class PS11_CallCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callTime;
        int callLength;
        float nightCallDiscount, discountPerHour, netCost;

        float callRatePerMinutes = 7.00f;

        final float taxRatePercentage = 0.06f; // 6%
        final float nightCallDiscountPercentage = 0.40f; //40%
        final float discountPerHourPercentage = 0.17f; //17%


        System.out.print("Call time (24-hour format): ");
        callTime = sc.nextInt();

        System.out.print("Length off call (minutes): ");
        callLength = sc.nextInt();

        float grossCost = callLength * callRatePerMinutes;
        System.out.println("Gross Cost: " + grossCost);

        //a. Any call started after 7:00PM (1900 hours) but before 8:00AM (800 hours) is  discounted 40%.
        //b. Any call started after 8:00AM (800 hours) but before 7:00PM (1900 hours) is charged full.


        if (callTime >= 1900 || callTime < 800) {
            nightCallDiscount = grossCost * nightCallDiscountPercentage;
            grossCost = grossCost - nightCallDiscount;
        }

        if (callLength > 60) {
            discountPerHour = grossCost * discountPerHourPercentage;
            grossCost =  grossCost - discountPerHour;
        }


        //c. All calls are subjected to 6% tax.
       float taxPaid = grossCost * taxRatePercentage;
        netCost = grossCost + taxPaid;

        System.out.println("Net Cost: " + netCost);




    }
}
