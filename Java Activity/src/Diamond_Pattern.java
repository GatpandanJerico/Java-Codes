

public class Diamond_Pattern {
    public static void main(String[] args) {
        int x = 4;

        //upper triangle
        for (int i = 0; i <= x; i++)
        {
            print_blocks(i,x-i);
        }
        //lower triangle
        for (int i = 0; i <= x; i++)
        {
            print_blocks(x-i, i);
        }
    }

    static void print_blocks(int x,int y) {
        for (int i = 0; i <= y; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i <= x; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < x; i++) {
            System.out.print("#");
        }
        System.out.print("\n");
    }
}
