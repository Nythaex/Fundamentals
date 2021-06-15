package org.first;

import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int j=0;
        for (int i=1;i<=num;i++){
            j+=1;
            for (int a=1;a<=j;a++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
