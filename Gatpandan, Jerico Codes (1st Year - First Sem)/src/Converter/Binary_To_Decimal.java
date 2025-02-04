package Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary: ");
        long binary = sc.nextLong();

        convert(binary);
    }
    public static void convert(long binary) {
        double base = 2;
        double exponent = 0;

        List<Long> unorderedList = new ArrayList<Long>();
        List<Long> orderedList = new ArrayList<Long>();
        List<Integer> doubleValue = new ArrayList<Integer>();


        while (binary > 0) {
            long digit = binary % 10;
            unorderedList.add(digit);
            binary = binary / 10;

        }

//        for (long i = unorderedList.size() - 1; i >= 0; i--) {
//            orderedList.add(unorderedList.get((int) i));
//        }

        for (int i = 0; i < unorderedList.size(); i++) {
            doubleValue.add((int) Math.pow(base, i));
        }
        int decimal = 0;
        for (int i = 0; i < unorderedList.size(); i++) {
            long value = unorderedList.get(i) * doubleValue.get(i);
            decimal += (int) value;
        }
        System.out.println("The Decimal Value is " + decimal);
    }
}
