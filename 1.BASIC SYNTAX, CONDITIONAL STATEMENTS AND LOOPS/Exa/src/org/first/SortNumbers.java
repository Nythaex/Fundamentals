package org.first;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=3;i++){
            if (a>=b && a>=c){
                System.out.println(a);
                a=-100;
            }
           else if (b>=a && b>=c){
                System.out.println(b);
                b=-100;
            }
          else   if (c>=a && c>=b){
                System.out.println(c);
                c=-100;
            }
        }
    }
}
