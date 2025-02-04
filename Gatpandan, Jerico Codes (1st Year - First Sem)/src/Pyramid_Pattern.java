import java.util.Scanner;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
         do {
             System.out.print("Height: ");
             x = sc.nextInt();
         } while (x < 1);
         sc.close();

        for (int i = 0; i < x; i++)
        {
            print_blocks(i+1,x - i);
        }

    }

    // method to print blocks and spaces
    static void print_blocks(int block,int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < block; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < block; i++) {
            System.out.print("#");
        }

        System.out.print("\n");
    }
}
