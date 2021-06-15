package org.first;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (true) {
            String comand = scanner.nextLine();
            if (comand.equals("Start")) {
                break;
            } else {
                double num = Double.parseDouble(comand);
                if (num == 0.1 || num == 0.2 || num == 0.5 || num == 1 || num == 2) {
                    sum += num;
                } else {
                    System.out.printf("Cannot accept %.2f%n", num);
                }
            }

        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {

            if (product.equals("Nuts")) {
                if (sum >= 2) {
                    sum -= 2;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                if (sum >= 0.7) {
                    sum -= 0.7;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (product.equals("Crisps")) {
                if (sum >= 1.5) {
                    sum -= 1.5;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (product.equals("Soda")) {
                if (sum >= 0.8) {
                    sum -= 0.8;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (product.equals("Coke")) {
                if (sum >= 1) {
                    sum -= 1;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else {
                System.out.println("Invalid product");
            }
            product = scanner.next();
        }
        System.out.printf("Change: %.2f",sum);
    }

}

