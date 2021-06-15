package org.first;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int key=Integer.parseInt(scanner.nextLine());
        int nums=Integer.parseInt(scanner.nextLine());
        String word="";
        for (int i=0;i<nums;i++){
            char chary=scanner.nextLine().charAt(0);
            System.out.printf("%c",chary+key);

        }
    }
}
