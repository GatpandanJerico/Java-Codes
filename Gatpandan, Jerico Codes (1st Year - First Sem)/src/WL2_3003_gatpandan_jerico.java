import java.util.Scanner;

public class WL2_3003_gatpandan_jerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }

        System.out.println("Sum of Numbers is " + sum);

        sc.close();
    }
}
