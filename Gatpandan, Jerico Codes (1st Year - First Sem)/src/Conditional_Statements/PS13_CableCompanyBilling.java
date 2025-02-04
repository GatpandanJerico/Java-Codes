/*
13.	Cable Company Billing. Write a program that calculates a customer’s bill for a local cable company. There are two types of customers: Residential and Business.

For residential customers, the following rates apply:
Bill Processing Fee: $4.50
Basic Service Fee: $20.50
Premium Channels: $7.50 per channel

For business customers, the following rates apply:
Bill Processing Fee: $15.00
Basic Service Fee: $75.00 for the first 10 connections; $5.00 for each additional connection
Premium Channels: $50.00 per channel for any number of connections

The program should ask the user for an account number (an integer) and a customer code. Assume that R or r stands for RESIDENTIAL customer, and B or b for a business customer.

 */

package Conditional_Statements;

import java.util.Scanner;

public class PS13_CableCompanyBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Customer Code Residential(R) or Business(B): ");
        String customerCode = sc.next().toUpperCase();


        if (customerCode.equals("R")) {
            System.out.print("Number of Premium Channels: ");
            int numOfChannels = sc.nextInt();

            float billProcessingFee = 4.50f;
            float basicServiceFee = 20.50f;
            float premiumChannels = 7.50f;


            System.out.println("\nBill Processing Fee: $4.50");
            System.out.println("Basic Service Fee: $20.50");
            System.out.println("Premium Channels ("+ numOfChannels +" channel): $" + (premiumChannels * numOfChannels));


            System.out.println("TOTAL: $" + (billProcessingFee + basicServiceFee + (premiumChannels * numOfChannels)));



        }
        else if (customerCode.equals("B")) {
            System.out.print("Number of Connection: ");
            int numOfConnection = sc.nextInt();

            System.out.print("Number of Premium Channels: ");
            int numOfChannels = sc.nextInt();

            float billProcessingFee = 15.00f;
            float basicServiceFee = 75.00f;
            float premiumChannels = 50.00f;
            int numberAdditionalConnection = 0;
            float additionalConnection = 0;

            if (numOfConnection > 10) {
                numberAdditionalConnection = numOfConnection - 10;
                additionalConnection = numberAdditionalConnection * 5;
            }

            System.out.println("\nBill Processing Fee: $15.00");
            System.out.println("Basic Service Fee (" + numOfConnection + " connections): $75.00 (first 10 connections) + $"+ additionalConnection + " (" + numberAdditionalConnection + " additional connections)");
            System.out.println("Premium Channels (" + numOfChannels + " channels): $" + (numOfChannels * premiumChannels));

            System.out.println("Total: " + (billProcessingFee + (basicServiceFee + additionalConnection) + (numOfChannels * premiumChannels)));
        }

    }
}
