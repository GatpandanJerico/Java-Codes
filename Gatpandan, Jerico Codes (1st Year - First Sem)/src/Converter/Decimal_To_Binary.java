package Converter;

import java.util.*;


public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        convertDecToBi(number);

    }

    public static void convertDecToBi(int number){

        List<Integer> binary = new ArrayList<Integer>();
        List<Integer> wholeNumber = new ArrayList<Integer>();
        int modulo = 0;


        for (int i = 0; number > 0; i++) {
            modulo = number % 2;
            binary.add(modulo);


            number = number / 2;
        }

        for (int i = binary.size() - 1; i >= 0; i--) {
            System.out.print(binary.get(i));
        }
    }
}
