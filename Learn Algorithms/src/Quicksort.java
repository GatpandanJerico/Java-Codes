/*
 * QuickSort (Divide and Conquer)
Implement the QuickSort algorithm which sorts an array of integers. QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
 */

public class Quicksort {

    public static void main(String[] args) {
        int[] array = { 67, 48, 18, 43, 59, 18, 68, 74, 16, 1 };
        System.out.println(quickSort(array));
    }

    private static int[] quickSort(int[] array) {
        int len = array.length;
        if (len <= 1) 
            return array;
        int pivot = array[len / 2];
        int left =     
    }
}