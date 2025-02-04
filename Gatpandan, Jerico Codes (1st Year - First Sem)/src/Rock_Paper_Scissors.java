import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String computerChoice;

        computerChoice = getComputerChoice();
        displayWinner(computerChoice, sc);

        Button btn = new Button();


    }



    public static String getComputerChoice() {
        Random random = new Random();

        int computerChoice = random.nextInt(3);

        return switch (computerChoice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "Scissors";
            default -> "";
        };
    }

    public static void displayWinner(String computerChoice, Scanner sc) {
            String humanChoice;

                do {
                    System.out.print("Choose Rock, Paper, Scissors: ");
                    humanChoice = sc.nextLine().toLowerCase();

                    if (humanChoice.equals("rock") && computerChoice.equals("scissors") ||
                            humanChoice.equals("paper") && computerChoice.equals("rock") ||
                            humanChoice.equals("scissors") && computerChoice.equals("paper")) {
                        System.out.println("You Win! Computer choose " + computerChoice + "\n");
                    } else if (humanChoice.equals(computerChoice)) {
                        System.out.println("It's a Tie!\n");
                    } else {
                        System.out.println("You lose! Computer Choose " + computerChoice + ". " + computerChoice + " beats " + humanChoice + ".\n");
                    }
                } while (humanChoice.equals("rock") || humanChoice.equals("paper") || humanChoice.equals("scissors"));



        }
    }

