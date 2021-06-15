import java.util.Collections;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splited = scanner.nextLine().split("\\s+");
        int[] numbs = new int[splited.length];
        for (int i = 0; i <= splited.length - 1; i++) {
            numbs[i] = Integer.parseInt(splited[i]);
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] info = command.split("\\s+");
            switch (info[0]){
                case "swap":
                    Collections.swap(Collections.singletonList(numbs),numbs[Integer.parseInt(info[1])],numbs[Integer.parseInt(info[2])]);
                    break;
                case "multiply":
                    numbs[Integer.parseInt(info[1])]*=numbs[Integer.parseInt(info[2])];
                    break;
                case "decrease":
                    for (int i = 0; i <= numbs.length - 1; i++) {
                        numbs[i]-=1;
                    }
                    break;

            }

            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbs.length - 1; i++) {
            System.out.print(numbs[i]);
            if (i!=numbs.length-1){
                System.out.print(", ");
            }

        }

    }
}
