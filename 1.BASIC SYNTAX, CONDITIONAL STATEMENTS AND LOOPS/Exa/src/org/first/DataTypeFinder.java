package org.first;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataTypeFinder {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        String comand = "";
        while (true) {
            comand = scanner.nextLine();
            if (comand.equals("END")){
                break;
            }
            boolean itsInt = true;
            try {
                int inti = Integer.parseInt(comand);
            } catch (NumberFormatException e) {
                itsInt = false;
            }
            boolean itsDouble = true;
            try {
                double dobli = Double.parseDouble(comand);
            } catch (NumberFormatException e) {
                itsDouble = false;
            }

            if (itsInt == true) {
                System.out.printf("%s is integer type%n", comand);
            } else if (itsDouble == true) {
                System.out.printf("%s is floating point type%n", comand);

            } else if (comand .equalsIgnoreCase("true") || comand.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type%n", comand);
            } else if (comand.length() == 1) {
                System.out.printf("%s is character type%n", comand);
            } else {
                System.out.printf("%s is string type%n", comand);
            }


        }

    }
}
