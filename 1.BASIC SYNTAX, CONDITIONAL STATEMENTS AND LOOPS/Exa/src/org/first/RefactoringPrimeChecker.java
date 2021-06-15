package org.first;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nums = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= nums; i++) {
            boolean prime = true;
            for (int cepitel = 2; cepitel < i; cepitel++) {
                if (i % cepitel == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, prime);
        }

    }
}
