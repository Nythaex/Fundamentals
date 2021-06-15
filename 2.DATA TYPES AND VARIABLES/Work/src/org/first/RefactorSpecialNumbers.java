package org.first;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nums = Integer.parseInt(scanner.nextLine());
        int theNum = 0;
        boolean trueOrFalse = false;
        for (int i = 1; i <= nums; i++) {
           int unchanged=i;
            while (i > 0) {
                theNum += i % 10;
                i/=10;
            }
            if (theNum == 5 || theNum== 7 || theNum == 11) {
                System.out.printf("%d -> True", unchanged);
                System.out.println();
            } else {
                System.out.printf("%d -> False", unchanged);
                System.out.println();
            }
            theNum = 0;
            i = unchanged;

        }
    }
}