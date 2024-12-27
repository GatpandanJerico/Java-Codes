import java.util.Scanner;

public class Coffee_Maker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like hot or cold coffee? (Enter 'hot' or 'cold'): ");
        String coffeeType = scanner.nextLine().toLowerCase();

        if (coffeeType.equals("hot")) {
            makeHotCoffee();
        } else if (coffeeType.equals("cold")) {
            makeColdCoffee();
        } else {
            System.out.println("Invalid input. Please enter 'hot' or 'cold'.");
        }

        scanner.close();
    }


    public static void makeHotCoffee() {
        try {
            System.out.println("Boiling water...");
            Thread.sleep(2000);
            System.out.println("Adding coffee powder to cup...");
            Thread.sleep(1000);
            System.out.println("Pouring hot water into cup...");
            Thread.sleep(1000);
            System.out.println("Stirring well...");
            Thread.sleep(1000);
            System.out.println("Adding sugar and milk (optional)...");
            Thread.sleep(1000);
            System.out.println("Stirring again...");
            Thread.sleep(1000);
            System.out.println("Your hot coffee is ready! Enjoy!");
        } catch (InterruptedException e) {
            System.out.println("Error in coffee preparation: " + e.getMessage());
        }
    }


    public static void makeColdCoffee() {
        try {
            System.out.println("Brewing coffee with hot water...");
            Thread.sleep(2500);
            System.out.println("Letting coffee cool down...");
            Thread.sleep(2000);
            System.out.println("Adding ice cubes to glass...");
            Thread.sleep(1000);
            System.out.println("Pouring cooled coffee into glass...");
            Thread.sleep(1000);
            System.out.println("Adding sugar and milk (optional)...");
            Thread.sleep(1000);
            System.out.println("Stirring well...");
            Thread.sleep(1000);
            System.out.println("Your cold coffee is ready! Enjoy!");
        } catch (InterruptedException e) {
            System.out.println("Error in coffee preparation: " + e.getMessage());
        }
    }
}
