package org.first;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            int sumOfNums = 0;
            int something=i;
            for (int av = 0; av < String.valueOf(i).length(); av++) {
                int last = something % 10;
                sumOfNums += last;
                something/= 10;
            }
            if (sumOfNums == 5 || sumOfNums == 7 || sumOfNums == 11) {
                System.out.printf("%d -> True", i);
                System.out.println();
            } else {
                System.out.printf("%d -> False", i);
                System.out.println();
            }

        }
    }
}
