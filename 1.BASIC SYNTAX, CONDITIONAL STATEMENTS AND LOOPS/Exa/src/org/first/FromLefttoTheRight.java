package org.first;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Integer.*;

public class FromLefttoTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = parseInt(scanner.nextLine());
        for (int i = 1; i <= numLines; i++) {
            boolean TheNextOne = false;
            String nums = scanner.nextLine();
            String leftnum = "";
            String rightnum = "";
            double leftsum = 0;
            double rightsum = 0;
            int totalSum = 0;
            for (int a = 0; a < nums.length(); a++) {
                char chary = (char) nums.charAt(a);


                if (chary == ' ') {
                    TheNextOne = true;
                    continue;
                }
                if (TheNextOne == false) {
                    leftnum += chary;
                } else {
                    rightnum += chary;
                }
            }
            leftsum = Long.parseLong(leftnum);
            rightsum = Long.parseLong(rightnum);


            if (leftsum > rightsum) {
                for (int a = 0; a < leftnum.length(); a++) {
                    char chary = leftnum.charAt(a);
                    if (chary=='-')
                    {
                        continue;
                    }
                    totalSum += (chary - 48);
                }
            } else {
                for (int a = 0; a < rightnum.length(); a++) {
                    char chary = rightnum.charAt(a);
                    if (chary=='-')
                    {
                        continue;
                    }
                    totalSum += (chary - 48);
                }
            }
            System.out.println(totalSum);
        }


    }
}
