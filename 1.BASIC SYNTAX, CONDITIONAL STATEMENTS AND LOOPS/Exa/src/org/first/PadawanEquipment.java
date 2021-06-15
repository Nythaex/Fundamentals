package org.first;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double myMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int saberCount = (int) Math.ceil(countStudents * 1.1);
        int beltCount=countStudents;
        if (countStudents>5){
            beltCount=countStudents-(countStudents/6);
        }
        double moneyNeeded = countStudents * robePrice + saberCount * saberPrice + beltCount*beltPrice;

        if (myMoney >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2f" + "lv.", moneyNeeded);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeeded - myMoney);
        }
    }
}
