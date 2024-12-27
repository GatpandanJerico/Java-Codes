package Java_Operator;//7.	Time Converter. Write a program which takes input Hours, Minutes, Seconds as integer
//      and Calculates the total number of seconds.
//Examples:
//If the user inputs is Hours=10, Minutes=50, Seconds=10 then output should be :
//Total number of Seconds : 39010
//If the user inputs is Hours=12, Minutes=25, Seconds=5 then output should be :
//Total number of Seconds : 44705
//
//SecondsTotal = (hours * 3600) + (minutes * 60) + second


import java.util.Scanner;

public class PS7_Time_Converter {
    public static void main(String[] args) {
        // 1. start
        Scanner sc = new Scanner(System.in);
        int hours, minute, seconds;
        int hoursToSecond, minutesToSecond;

        // 2. get input hours, minute, seconds
        System.out.print("Enter no. of Hours: ");
        hours = sc.nextInt();

        System.out.print("Enter no. of minutes: ");
        minute = sc.nextInt();

        System.out.print("Enter no. of second: ");
        seconds = sc.nextInt();

        // 3. Compute
        hoursToSecond = hours * 3600;
        minutesToSecond = minute * 60;

        // 4. Display
        System.out.println("Total number of Seconds : " + (hoursToSecond + minutesToSecond + seconds));
        // 5. End
    }
}
