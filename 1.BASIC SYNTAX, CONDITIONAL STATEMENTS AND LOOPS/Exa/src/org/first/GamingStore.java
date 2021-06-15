package org.first;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.next();
        command += scanner.nextLine();
        double sum = 0;
        if (balance == 0) {

            System.out.println("Out of money!");
            return;
        }
        while (!command.equals("Game Time")) {
            if (command.equals("OutFall 4")) {
                if (balance < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    sum += 39.99;
                    System.out.println("Bought OutFall 4");
                }
            } else if (command.equals("CS: OG")) {
                if (balance < 15.99) {
                    System.out.println("Too Expensive");
                } else {
                    sum += 15.99;
                    System.out.println("Bought CS: OG ");
                }
            } else if (command.equals("Zplinter Zell")) {
                if (balance < 19.99) {
                    System.out.println("Too Expensive");
                } else {
                    sum += 19.99;
                    System.out.println("Bought Zplinter Zell");
                }
            } else if (command.equals("Honored 2")) {
                if (balance < 59.99) {
                    System.out.println("Too Expensive");
                } else {
                    sum += 59.99;
                    System.out.println("Bought Honored 2");
                }
            } else if (command.equals("RoverWatch")) {
                if (balance < 29.99) {
                    System.out.println("Too Expensive");
                } else {
                    sum += 29.99;
                    System.out.println("Bought RoverWatch");
                }
            } else if (command.equals("RoverWatch Origins Edition")) {
                if (balance < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    sum += 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            } else {
                System.out.println("Not Found");
            }
            if (sum >= balance) {
                System.out.println("Out of money!");
                return;
            }
            command = scanner.nextLine();

        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, balance - sum);
    }
}
