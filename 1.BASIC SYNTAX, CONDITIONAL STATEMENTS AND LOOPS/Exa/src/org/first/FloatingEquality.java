package org.first;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double first=Double.parseDouble(scanner.nextLine());
        double second=Double.parseDouble(scanner.nextLine());
        double eps=Math.abs(first-second);
        if (eps>0.000001){
            System.out.println("False");
        }
        else System.out.println("True");
    }
}
