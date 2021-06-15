package org.first;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double monitorPrice=Double.parseDouble(scanner.nextLine());
        int trashesBoth=0;
        int lostMouses=0;
        int lostKeyboards=0;
        int lostHeadsets=0;
        int lostMonitors=0;
        int momento=0;

        for (int i=2;i<=lostGames;i++){
            if(Math.ceil(i%2)==0){
            lostHeadsets+=1;
            }
            if(i%3==0){
                lostMouses+=1;
            }if(i%2==0&&i%3==0){
                lostKeyboards+=1;
                momento+=1;
            }if(lostKeyboards%2==0){
                if (momento==0){
                }
                else {
                    lostMonitors+=1;
                    momento=0;
                }
            }
        }
        double allPrice=mousePrice*lostMouses+headsetPrice*lostHeadsets+keyboardPrice*lostKeyboards+monitorPrice*lostMonitors;
        System.out.printf("Rage expenses: %.2f lv.",allPrice);
    }
}
