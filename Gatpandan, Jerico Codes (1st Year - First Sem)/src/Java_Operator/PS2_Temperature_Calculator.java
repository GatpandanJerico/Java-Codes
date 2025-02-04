package Java_Operator;//2.	Temperature Calculator. Create a program that converts a temperature
//      given in Celsius to Fahrenheit and Kelvin.
//Celsius to Fahrenheit °F = (°C × 9/5 ) + 32
//Celsius to Kelvin ºK = ºC+ 273.15
//
//Example:
//Enter temperature in Celsius: -4.5 -4.5
//Celsius is equal to 23.9 Fahrenheit -4.5 Celsius is equal to 268.6 Kelvin.

/*
    * Algorithm:
    * 1. Start
    * 2. Get the input (Celsius).
    * 3. Compute Fahrenheit and kelvin.
    * 4. Display the result.
    * 5. End
* */

import java.util.Scanner;

public class PS2_Temperature_Calculator {
    public static void main(String[] args) {
//        1. Start
            Scanner sc = new Scanner(System.in);
            double celsius, fahrenheit, kelvin;

//        2. Get the input (Celsius).
        System.out.print("Enter the Celsius: ");
        celsius = sc.nextFloat();

//        3. Compute Fahrenheit and kelvin.
            fahrenheit = (celsius * 9/5 ) + 32;
            kelvin = celsius + 273.15;

//        4. Display the result.
            System.out.println("\nThe farenheit is " + fahrenheit + ".");
            System.out.println("The Kelvin is " + kelvin + ".");
//        5. End
    }
}
