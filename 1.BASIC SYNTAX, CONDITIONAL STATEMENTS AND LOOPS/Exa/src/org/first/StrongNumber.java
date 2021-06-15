package org.first;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String numS=scanner.nextLine();
        int sum=0;
        int sumnow=1;

        for (int string=numS.length()-1;string>=0;string--){
            char chary=numS.charAt(string);
            int inty=Character.getNumericValue(chary);
            {
                sumnow=1;
                for (int i=inty;i>=1;i--){
                    sumnow*=i;
                }
            }
            sum+=sumnow;
        }
        if(sum==Integer.parseInt(numS)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
