/**
 * Name: Jerico C. Gatpandan
 * Date: October 1, 2024,
 * Section: ACT112L-OAa
 */

import java.util.*;

public class P4_GATPANDAN_JERICO_ACT112L_OAa_OCT_1_2024 {
    public static void main(String[] args) {

        game(); // Call the game Method

    }

    public static void game() {
        Scanner sc = new Scanner(System.in);

        // Variables
        int money = 20;
        Random random = new Random();
        final String[] choice = {"red", "green", "yellow", "blue", "white", "pink"};


        // A continues loop when money is sill not 0
        while (true) {
            int max = 3;
            System.out.println("Your money is PHP"+ money);

            Map<String, Integer> bets = new HashMap<>();
            String color;
            int bet;

            // Continues Loop to get the right color choice from the user and get input from the user 3 times
            do {

                System.out.print("\nWhich color do you want to bet (red, green, yellow, blue, white, pink) ? or (type \"done\" to finish) : ");
                color = sc.nextLine().toLowerCase();

                if (color.equals("done")) {
                    break;
                }

                // Call the validColor() method to check if color is valid or not
                if (!validColor(choice, color)) {
                    System.out.println("Invalid color! Try again");
                    continue;
                }

                // User enter the bet amount for that color
                do {
                    System.out.print("Enter your bet (max = " + money + "): ");
                    bet = sc.nextInt();
                    if (bet > money) {
                        System.out.println("Money not enough! Try Again.");
                        continue;
                    }

                    sc.nextLine(); // Clear the \n character
                } while (bet > money);


                money = money - bet;
                bets.put(color, bet);

                max--;
            } while (max > 0);


            // Generate random number
            int rand1 = random.nextInt(5);
            int rand2 = random.nextInt(5);
            int rand3 = random.nextInt(5);


            // Convert Random number to String
            String randColor1 = convertRand(rand1);
            String randColor2 = convertRand(rand2);
            String randColor3 = convertRand(rand3);



            // Print the random colors
            System.out.println("\nThe random colors are: " + randColor1 + ", " + randColor2 + ", " + randColor3 + "\n");

            // Getting the value of hashmap and pass it as the parameter of determineWinner() method
            for (Map.Entry<String, Integer> entry : bets.entrySet()) {
                String playerColor = entry.getKey();
                int playerBet = entry.getValue();

                int winnings = determineWinner(playerBet, playerColor, randColor1, randColor2, randColor3);
                money += winnings;


            }
            // Exit if money is 0
            System.out.println("\nYour Money now is PHP" + money);
            if (money <= 0) {
                System.out.println("Game Over! your money is now 0");
                break;
            }

            // Ask the user to play again
            System.out.print("\nDo you want to play again? (Yes/No) ");
            String playAgain = sc.nextLine().toLowerCase();
            if (playAgain.equals("no")){
                break;
            }
        }
    }

    // method to convert the random number to its corresponding color
    private static String convertRand(int rand) {
        switch (rand) {
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "yellow";
            case 3:
                return "blue";
            case 4:
                return "white";
            case 5:
                return "pink";
            default: return "";
        }
    }

    // Method to determine the winner
    private static int determineWinner(int bet, String color, String randColor1, String randColor2, String randColor3) {
        int multiplier = 0;
        int winnings = 0;

        // Add 1 to multiplier if there is a match
        if (color.equals(randColor1)) {
            multiplier++;
        }
        if (color.equals(randColor2)) {
            multiplier++;
        }
        if (color.equals(randColor3)) {
            multiplier++;
        }


        if (multiplier > 0) {
            // Print which color that I win and how many times
            System.out.println("You Won on " + color + "! " + color + " appeared " + multiplier + " times."+ "    " + "(" + bet + " * " + (multiplier + 1) + " = " + (bet * (multiplier + 1)) +")" );
        }
        else {
            System.out.println("You lose on color " + color);
        }

        // Compute winnings
        if (multiplier == 1) {
            winnings = bet * 2;
        }
        else if (multiplier == 2) {
            winnings = bet * 3;
        }
        else if (multiplier == 3) {
            winnings = bet * 4;
        }

        return winnings;
    }

    // method to check if the input is a valid color
    private static boolean validColor(String[] choice, String color) {
        for (String i : choice) {
            if (i.equals(color)) {
                return true;
            }
        }
        return false;
    }


}
