
import java.util.Random;

public class PO7_GATPANDAN_JERICO_ACT112L_OAa_DEC_7_2024 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] num;
        num = new int[24];

        int flood_level = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(51);
            flood_level += num[i];
        }

        System.out.println("Flood Level accumulation in 24 hours: " + flood_level + "mm");

        if (flood_level < 100) {
            System.out.println("No Flood");
        } else if (flood_level <= 200) {
            System.out.println("Flood Watch");
        } else if (flood_level <= 300) {
            System.out.println("Flood Warning");
        } else {
            System.out.println("Severe Flood Warning");
        }

    }
}