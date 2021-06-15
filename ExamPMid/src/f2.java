import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class f2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splited = scanner.nextLine().split("\\|");
        int[] field = new int[splited.length];
        for (int i = 0; i <= splited.length - 1; i++) {
            field[i] = Integer.parseInt(splited[i]);
        }
        int points = 0;
        String command = scanner.nextLine();


        while (!command.equals("Game over")) {
            String[] split = command.split(" ");
            if (split[0].equals("Shoot")) {
                String[] typeMoving = split[1].split("@");
                if (Integer.parseInt(typeMoving[1]) < 0 || Integer.parseInt(typeMoving[1]) >= field.length) {
                    command = scanner.nextLine();
                    continue;
                }
                int shoot = Integer.parseInt(typeMoving[1]);
                if (typeMoving[0].equals("Left")) {
                    for (int i = 1; i <= Integer.parseInt(typeMoving[2]); i++) {
                        if (shoot == 0) {
                            shoot = field.length - 1;
                        } else {
                            shoot--;
                        }
                    }
                    for (int i = 1; i <= 5; i++) {
                        if (field[shoot] == 0) {
                            break;
                        }
                        points++;
                        field[shoot]--;
                    }

                } else {
                    for (int i = 1; i <= Integer.parseInt(typeMoving[2]); i++) {
                        if (shoot == field.length - 1) {
                            shoot = 0;
                        } else {
                            shoot++;
                        }
                    }
                    for (int i = 1; i <= 5; i++) {
                        if (field[shoot] == 0) {
                            break;
                        }
                        points++;
                        field[shoot]--;
                    }
                }
            } else {
                field=reverse(field);
            }
            command = scanner.nextLine();
        }


        for (int i = 0; i <= field.length - 1; i++) {
            System.out.print(field[i]);
            if (i != field.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
        System.out.printf("Iskren finished the archery tournament with %d points!", points);
    }
    static int[] reverse(int a[])
    {
        int n=a.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }
}
