import java.util.ArrayList;

public class GreedyCoinChange {

    public static void main(String[] args) {
        int[] coins = { 1, 5, 10, 20 };
        int amount = 63;

        System.out.println(greedyCoinChange(coins, amount));
    }

    private static ArrayList<Integer> greedyCoinChange(int[] coins, int amount) {
        int n = coins.length;
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Sort the array from descending order
        for (int i = 0; i < n / 2; i++) {
            int t = coins[i];
            coins[i] = coins[n - i - 1];
            coins[n - i - 1] = t;
        }

        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }

        return result;
    }
}