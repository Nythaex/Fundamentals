package org.first;

import java.util.Scanner;

public class CharstoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        String sum =String.valueOf(a)+(b)+(c);


        System.out.println(sum);
    }
}
