/**
 * Name: Jerico C. Gatpandan
 * Date: November 26, 2024
 * Section: ACT112L-OAa
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class User {
    String username;
    String pin;
    double balance;
    String accountType;
    int failedAttempts;
    boolean isLocked;
    double dailyWithdrawn;

    User(String username, String pin,String accountType, double balance) {
        this.username = username;
        this.pin = pin;
        this.balance = balance;
        this.accountType = accountType;
        this.failedAttempts = 0;
        this.isLocked = false;
        this.dailyWithdrawn = 0;
    }
}

public class P06_GATPANDAN_JERICO_ACT112L_OAa_NOV_24_2024 {
    static final double SAVINGS_INTEREST_RATE = 0.03;
    static ArrayList<User> users = new ArrayList<>();
    static User currentUser = null;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);


        System.out.println("\nWelcome to the Multi-Tier Bank Account Management System");
        System.out.println("1. Register\n2. Login\n3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1: register(sc);
                    break;
            case 2: login(sc);
                    break;
            case 3: System.out.println("Thank you for using the system. Goodbye!");
                    return;
            default: System.out.println("Invalid choice. Please try again");
        }
        mainMenu();
    }

    public static void register(Scanner sc) {
        System.out.print("\nEnter a username: ");
        String username = sc.nextLine();

        for (User user : users) {
            if (user.username.equals(username)) {
                while (user.username.equals(username)) {
                    System.out.println("Username already exists. Please choose a different username.");
                    System.out.print("\nEnter a username: ");
                    username = sc.nextLine();
                }
            }
        }

        String pin;
        while (true) {
            System.out.print("Enter a 4-digit PIN: ");
            pin = sc.nextLine();
            if (pin.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter exactly 4 digits.");
            }
        }

        int accountChoice;
        do {
            try {
                System.out.print("Choose account type:\n1. Savings\n2. Current\nEnter your choice: ");
                accountChoice = sc.nextInt();
                if (accountChoice < 1 || accountChoice > 2) {
                    System.out.println("Invalid Choice. Please try again.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Input only accept valid digit numbers.");
                return;
            }
        } while (accountChoice < 1 || accountChoice > 2);


        String accountType = accountChoice == 1 ? "Savings" : "Current";
        int minBalance = accountChoice == 1 ? 1000 : 5000;

        double initialDeposit;
        try {
            System.out.print("\nEnter your initial deposit: ");
            initialDeposit = sc.nextDouble();

            if (initialDeposit < minBalance) {
                do {
                    System.out.println("Invalid deposit. Minimum balance for a " + accountType + " account is " + minBalance + ".");
                    System.out.print("\nEnter your initial deposit: ");
                    initialDeposit = sc.nextDouble();
                } while (initialDeposit < minBalance);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Deposit should only contain valid digit numbers.");
            return;
        }

        users.add(new User(username, pin, accountType, initialDeposit));
        System.out.println("Registration successful!");
        sc.nextLine();
    }

    public static void login(Scanner sc) {
        while (true) {
            System.out.print("\nEnter username: ");
            String username = sc.nextLine();

            boolean found = false;
            for (User user : users) {
                if (user.username.equals(username)) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                System.out.println("Username not found.");
                return;
            }

            System.out.print("Enter 4-digit PIN: ");
            String pin = sc.nextLine();
            sc.nextLine();

            for (User user : users) {
                if (user.username.equals(username)) {
                    if (user.isLocked) {
                        System.out.println("Account is locked due to multiple failed login attempts.");
                        return;
                    }
                    if (user.pin.equals(pin)) {
                        currentUser = user;
                        user.failedAttempts = 0;
                        System.out.println("Login successful!");
                        postLoginMenu(sc);
                        return;
                    }
                    else  {
                        user.failedAttempts++;
                        System.out.println("Incorrect credentials. Try again.");
                        if (user.failedAttempts == 3) {
                            user.isLocked = true;
                            System.out.println("Account locked due to multiple failed login attempts.");
                        }
                        return;
                    }
                }
            }
        }
    }

    public static void postLoginMenu(Scanner sc) {
        while (currentUser != null) {
            System.out.println("\nWelcome, " + currentUser.username);
            System.out.println("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Calculate Interest (Saving Only)\n5. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("\nYour current balance is: " + currentUser.balance);
                        break;
                case 2: depositMoney(sc);
                        break;
                case 3: withdrawMoney(sc);
                        break;
                case 4: calculateInterest(sc);
                        break;
                case 5: {
                    currentUser = null;
                    System.out.println("Logged out successfully.");
                }
                    break;
                default: System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    public static void depositMoney(Scanner sc) {
        double amount;
        int minBalance;
        try {
            do {
                System.out.print("\nEnter deposit amount: ");
                amount = sc.nextDouble();
                sc.nextLine();

                String accountType = currentUser.accountType;
                minBalance = accountType == "Savings" ? 1000 : 5000;

                if (amount <= 0) {
                    System.out.println("Invalid amount. Deposit must be positive.");
                } else if ((amount + currentUser.balance) < minBalance) {
                    System.out.println("Invalid deposit. Minimum balance for a " + accountType + " account is " + minBalance + ".");
                } else {
                    currentUser.balance += amount;
                    System.out.println("Deposit successful! New balance: " + currentUser.balance);
                }
            } while (amount + currentUser.balance < minBalance) ;
        } catch (InputMismatchException exception) {
            System.out.println("Input should only contain valid digit numbers.");
            return;
        }


    }

    public static void withdrawMoney(Scanner sc) {
        final double DAILY_WITHDRAWAL_LIMIT = 20000;
        double amount;

        if (currentUser.accountType.equals("Savings")) {
            double remainingLimit = DAILY_WITHDRAWAL_LIMIT - currentUser.dailyWithdrawn;
            System.out.println("Your daily withdrawal limit for Savings accounts is 20,000.");
            System.out.println("You have " + remainingLimit + " remaining for today.");

            if (remainingLimit <= 0) {
                System.out.println("You have reached your daily withdrawal limit. No further withdrawals allowed today.");
                return;
            }
        }

        try {
            System.out.print("Enter withdrawal amount: ");
            amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount. Withdrawal must be positive.");
                return;
            }

            if (currentUser.accountType.equals("Savings")) {
                double remainingLimit = DAILY_WITHDRAWAL_LIMIT - currentUser.dailyWithdrawn;

                if (amount > remainingLimit) {
                    System.out.println("Withdrawal exceeds your remaining daily limit of " + remainingLimit + ". Transaction declined.");
                    return;
                }
            }

            if (amount > currentUser.balance) {
                System.out.println("Insufficient balance. Your current balance is " + currentUser.balance + ".");
                return;
            }


            currentUser.balance -= amount;
            if (currentUser.accountType.equals("Savings")) {
                currentUser.dailyWithdrawn += amount;
            }

            System.out.println("Withdrawal successful! New balance: " + currentUser.balance);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.nextLine();
        }
    }


    public static void calculateInterest(Scanner sc) {
        sc.nextLine();
        if (currentUser.accountType.equals("Current")) {
            System.out.println("This feature is not available for Current accounts.");
        }
        else {
            double interest = currentUser.balance * SAVINGS_INTEREST_RATE;
            currentUser.balance += interest;
            System.out.println("\nInterest earned: " + interest);
            System.out.println("New balance: " + currentUser.balance);

        }
    }
}