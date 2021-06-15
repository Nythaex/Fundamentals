package org.first;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String something=scanner.nextLine();
        String reversed="";
        for (int i=something.length()-1;i>=0;i--){
            char a=something.charAt(i);
            reversed+=a;
        }
        System.out.println(reversed);

    }
}
