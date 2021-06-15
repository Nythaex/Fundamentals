package org.first;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        if (amount >= 30) {
                            totalPrice = (8.45 * amount) - ((8.45 * amount) * 0.15);
                        } else {
                            totalPrice = (8.45 * amount);
                        }
                        break;
                    case "Saturday":
                        if (amount >= 30) {
                            totalPrice = (9.80 * amount) - ((9.80 * amount) * 0.15);
                        } else {
                            totalPrice = (9.80 * amount);
                        }
                        break;
                    case "Sunday":
                        if (amount >= 30) {
                            totalPrice = (10.46 * amount) - ((10.46 * amount) * 0.15);
                        } else {
                            totalPrice = (10.46 * amount);
                        }
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        if (amount >= 100) {
                            totalPrice = 10.9 * (amount-10) ;
                        } else {
                            totalPrice = (10.9 * amount);
                        }
                        break;
                    case "Saturday":
                        if (amount >= 100) {
                            totalPrice = 15.6 * (amount-10);
                        } else {
                            totalPrice = (15.6 * amount);
                        }
                        break;
                    case "Sunday":
                        if (amount >= 100) {
                            totalPrice = 16* (amount-10) ;
                        } else {
                            totalPrice = (16 * amount);
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        if (amount >=10&&amount<=20) {
                            totalPrice = (15* amount) - ((15* amount) * 0.05);
                        } else {
                            totalPrice = (15* amount);
                        }
                        break;
                    case "Saturday":
                        if (amount >=10&&amount<=20) {
                            totalPrice = (20 * amount) - ((20 * amount) * 0.05);
                        } else {
                            totalPrice = (20 * amount);
                        }
                        break;
                    case "Sunday":
                        if (amount >=10&&amount<=20) {
                            totalPrice = (22.5 * amount) - ((22.5* amount) * 0.05);
                        } else {
                            totalPrice = (22.5 * amount);
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
