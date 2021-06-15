package org.first;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        String all=Character.toString(a)+Character.toString(b)+Character.toString(c);
        for (int i=2;i>=0;i--){
            System.out.print(all.charAt(i)+" ");
        }
    }
}
