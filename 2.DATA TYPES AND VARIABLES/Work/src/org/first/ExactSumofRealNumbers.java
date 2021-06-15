package org.first;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= nums; i++) {
            BigDecimal numAtString = scanner.nextBigDecimal();
            sum = sum.add(numAtString);
        }
        System.out.println(sum);
    }
}
