package org.first;

import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double dokars=Double.parseDouble(scanner.nextLine())*1.31;
        System.out.printf("%.3f",(dokars));


    }
}
