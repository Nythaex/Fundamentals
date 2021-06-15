import com.sun.jdi.Value;

import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fielsize = Integer.parseInt(scanner.nextLine());
        String[] indexes = scanner.nextLine().split(" ");
        int[] field = new int[fielsize];

        for (int i = 0; i <indexes.length; i++) {
            int index = Integer.parseInt(indexes[i]);
            if (index >= 0 && index < fielsize) {
                field[index] = 1;
            }

        }
        String comand = scanner.nextLine();
        while (!(comand.equals("end"))) {
            String[] comandArray = comand.split(" ");
            int start = Integer.parseInt(comandArray[0]);
            String cmd=comandArray[1];
            int flyLength = Integer.parseInt(comandArray[2]);
            if (start < 0 || start > fielsize - 1 || field[start] == 0) {
                comand = scanner.nextLine();
                continue;
            }
            field[start] = 0;


            if (cmd.equals("right")) {
                start += flyLength;
                while (start < fielsize && field[start] == 1) {
                    start += flyLength;

                }
                if(start<fielsize){
                    field[start]=1;
                }
            } else  {
                start -= flyLength;
                while (start >=0 && field[start] == 1) {
                    start -= flyLength;

                }
                if(start>=0){
                    field[start]=1;
                }
            }
            comand = scanner.nextLine();
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
        System.out.println();

    }
}