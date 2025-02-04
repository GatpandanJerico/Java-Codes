import java.util.ArrayList;
import java.util.Scanner;

public class Alphabet_Number_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter no. of Words : ");
            int numWords = sc.nextInt();
            sc.nextLine();

            ArrayList<String> words = new ArrayList<>();
            ArrayList<Integer> values = new ArrayList<>();

            for (int i = 1; i <= numWords; i++) {
                System.out.print("Enter Word no. " + i + ": ");
                String word = sc.nextLine().toUpperCase();
                words.add(word);
            }

            for (String word : words) {
                int sum = 0; // Reset sum for each word
                for (char c : word.toCharArray()) {
                    if (c >= 'A' && c <= 'Z') {
                        sum += (int) c - 65 + 1;
                    }
                }
                values.add(sum);
            }

            System.out.println("\nNo.   Word         Equivalent");
            for (int i = 0; i < words.size(); i++) {
                String line = (i + 1) + "     " + words.get(i) + "          " + values.get(i);
                System.out.println(line);
            }

            System.out.print("\nWould you like to try again? [Y/N]: ");
            String choice = sc.nextLine().toUpperCase();

            if (choice.equals("N")) {
                System.out.println("Thank you!");
                break;
            }
        }
    }
}
