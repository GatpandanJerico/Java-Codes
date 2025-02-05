public class factorial {
    public static void main(String[] args) {
       int n = 5;
       
        printRows(n);
    }
        
        
    private static void printRows(int n) {
        if (n <= 0) {
            return;
        }
        printRows(n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(i);
   
        
        System.out.println();
    }
        
}