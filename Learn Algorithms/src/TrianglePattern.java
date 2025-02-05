public class TrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            printRows(i + 1, (n - 1) - i);
        }

    }

    private static void printRows(int n, int spaces) {
        if (n <= 0) {
            return;
        }

        for (int i = 0; i < spaces; i++)
            System.out.print(".");

        for (int i = 0; i < n; i++)
            System.out.print("#");

        System.out.println();
    }

}