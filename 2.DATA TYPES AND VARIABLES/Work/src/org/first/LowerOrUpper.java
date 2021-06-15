package org.first;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char Alpha=scanner.nextLine().charAt(0);
        if (Alpha<=122&&Alpha>=97){
            System.out.println("lower-case");
        }
        else if (Alpha<=90&&Alpha>=65){
            System.out.println("upper-case");
        }

    }
}
