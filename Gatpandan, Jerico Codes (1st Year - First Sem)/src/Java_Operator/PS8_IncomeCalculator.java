package Java_Operator;
/*
8.	Income Calculator. You found an exciting summer job for five weeks. It pays $15.50 per hours. Suppose that the total tax you pay on your summer job income is 14%. After paying the taxes, you spend 10% of your net income to buy new clothes and other accessories for the next school year and 1% to buy school supplies. After buying clothes and school supplies, you use 25% of the remaining money to buy savings bond. For each dollar you spend to buy savings bond, your parents spend $0.50 to buy additional savings bond for you.

Write a program that prompts the user to enter the number of hours worked each week. The program then outputs the following:
a) Your income before(GROSS) and after(NET) taxes from your summer job
b) the amount of tax you pay
c) the money you spend on clothes and other accessories
d) the money you spend on school supplies
e) the money you spend to buy savings bonds
f) the money your parents spend to buy additional savings bond for you
g) the total remaining money you have from your summer job income

*/

import java.util.Scanner;

public class PS8_IncomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float salaryRate = 15.50f;
        final float taxRate = 14; // 14%
        final float clothesPercentage = 10; // 10%
        final float schoolSuppliesPercentage = 1; // 1%
        final float savingsBondsPercentage = 25; // 25%
        final float parentsSavingsBondsMultiplier = 0.50f;

        float grossIncome, netIncome, taxPaidAmount, remainingAfterExpenses, remainingNetIncome;
        int hoursWorkedPerWeek;

        do {
            System.out.print("Enter the number of hours you worked each week: ");
            hoursWorkedPerWeek = sc.nextInt();
            if (hoursWorkedPerWeek < 0) {
                System.out.println("Try again! Hours of work each shouldn't be negative.");
            }

        } while (hoursWorkedPerWeek < 0);

        int totalHoursWorkedPerWeek = hoursWorkedPerWeek * 5;

        //a) Your income before(GROSS) and after(NET) taxes from your summer job
        grossIncome = salaryRate * totalHoursWorkedPerWeek;
        netIncome = grossIncome - (taxRate / 100 * grossIncome);
        System.out.printf("GROSS Income: $%.2f\n", grossIncome);
        System.out.printf("NET Income: $%.2f\n", netIncome);

        //b) the amount of tax you pay
        taxPaidAmount = taxRate / 100f * grossIncome;
        System.out.printf("Tax paid: $%.2f\n", taxPaidAmount);

        //c) the money you spent on clothes and other accessories
        float clothes = clothesPercentage / 100f * netIncome;
        System.out.printf("The money spent on clothes and accessories: $%.2f\n", clothes);

        //d) the money you spent on school supplies
        float schoolSupplies = schoolSuppliesPercentage / 100f * netIncome;
        System.out.printf("The money spent on school supplies: $%.2f\n", schoolSupplies);

        //e) the money you spent to buy savings bonds
        remainingAfterExpenses = netIncome - (clothes + schoolSupplies);
        float savingsBonds = savingsBondsPercentage / 100f * remainingAfterExpenses;
        System.out.printf("The money spent to buy saving bonds: $%.2f\n", savingsBonds);

        //f) the money your parents spent to buy additional savings bond for you
        float parentsSavingsBonds = parentsSavingsBondsMultiplier * savingsBonds;
        System.out.printf("The money that my parents spent to buy additional savings bond: $%.2f\n", parentsSavingsBonds);

        //g) the total remaining money you have from your summer job income
        remainingNetIncome = remainingAfterExpenses - savingsBonds;
        System.out.printf("The remaining net income: $%.2f\n", remainingNetIncome);

        sc.close();
    }

}
