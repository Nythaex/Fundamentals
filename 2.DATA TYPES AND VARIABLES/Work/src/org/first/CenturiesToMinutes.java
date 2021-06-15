package org.first;

import java.util.Scanner;


public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cent=Integer.parseInt(scanner.nextLine());
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",cent,cent*100,(int)(cent*100*365.2422),((int)(cent*100*365.2422)*24),(((int)(cent*100*365.2422)*24)*60));


    }
}
