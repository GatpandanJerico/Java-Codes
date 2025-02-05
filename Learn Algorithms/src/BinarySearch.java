/*
 * Problem 1: Binary Search (Divide and Conquer)
Given a sorted list of n integers and a target integer x, write a function that finds the position of x in the list using a binary search algorithm. Remember, binary search operates by effectively dividing the problem in half with each step.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 3, 17, 21, 45, 62, 82, 87, 89, 98 };
        int x = 82;

        int result = binarySearch(array, x);
        System.out.println(result);
    }

    private static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (array[mid] < x) {
                low = mid + 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
