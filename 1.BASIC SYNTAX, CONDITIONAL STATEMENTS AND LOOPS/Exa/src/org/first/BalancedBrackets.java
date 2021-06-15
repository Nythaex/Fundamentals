package org.first;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int right = 0;
        int left = 0;
        boolean theNextOne = true;
        boolean consecutiver = false;
        boolean consecutivel = false;
        for (int i = 0; i < lines; i++) {
            String comand = scanner.nextLine();

            if (comand.equals("(")) {
                theNextOne = true;
                right++;
                if (consecutiver == true) {
                    System.out.println("UNBALANCED");
                    return;
                }
                consecutiver = true;
                consecutivel=false;
            }
            if (comand.equals(")") && theNextOne == true) {
                if (right == 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
                theNextOne = false;
                left++;
                if (consecutivel == true) {
                    System.out.println("UNBALANCED");
                    return;
                }
                consecutivel=true;
                consecutiver = false;

            } else if (comand.equals(")")) {
                System.out.println("UNBALANCED");
                return;
            }
            if (!(comand.equals("(") || comand.equals(")"))) {
                consecutiver = false;
                consecutivel=false;
            }

        }
        if (right == left) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
