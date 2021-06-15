package org.first;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        int people=Integer.parseInt(scanner.nextLine());
        short km=Short.parseShort(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",city,people,km);

    }
}
