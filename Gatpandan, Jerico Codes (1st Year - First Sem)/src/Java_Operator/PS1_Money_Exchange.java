package Java_Operator;/*
* 1.	Simple Money Exchange Program. Create a program that allows the user to input money in Peso (PHP).
        Then the program will convert the money to US Dollars (USD) and display the result. The exchange rate is 1 PHP=45.25 USD.

        The example output of the program is shown below:
        Enter money in PHP : 1000
        The money in USD is : 45250

        Algorithm:
        * 1. Start
        * 2. Get the user Input in Pesos.
        * 3. Convert the money to US Dollars (1 PHP = 45.25 USD)
        * 4. Display the result
        * 5. End

* */

import java.util.Scanner;

public class PS1_Money_Exchange {
    public static void main(String[] args) {
//        1. Start
        Scanner sc = new Scanner(System.in);
        float pesos;
        double result;

//        2. Get the user Input in Pesos.
        System.out.print("Enter the Input: ");
        pesos = sc.nextFloat();

//        3. Convert the money to US Dollars (1 PHP = 45.25 USD)
        result = pesos * 45.25;

//        4. Display the result
        System.out.println(pesos + " is " + result +  " in dollars.");
//        5. End
    }
}
