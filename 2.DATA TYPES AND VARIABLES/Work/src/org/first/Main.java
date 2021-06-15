package org.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometer=Double.parseDouble(scanner.nextLine())/1000;
        System.out.printf("%.2f",(kilometer));

    }
}
