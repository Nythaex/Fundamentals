import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] houseSplited = scanner.nextLine().split("@");
        int[] houses = new int[houseSplited.length];
        for (int i = 0; i <= houseSplited.length - 1; i++) {
            houses[i] = Integer.parseInt(houseSplited[i]);
        }
        int cupidonPosition = 0;
        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            String[] splited = command.split(" ");
            if (cupidonPosition + Integer.parseInt(splited[1]) > houses.length - 1) {
                cupidonPosition = 0;
                if (houses[cupidonPosition] <= 0) {
                    System.out.printf("Place %d already had Valentine's day.", cupidonPosition);
                    System.out.println();
                } else {
                    houses[cupidonPosition] -= 2;
                    if (houses[cupidonPosition] <= 0) {
                        System.out.printf("Place %d has Valentine's day.", cupidonPosition);
                        System.out.println();
                    }
                }
            } else {
                cupidonPosition += Integer.parseInt(splited[1]);
                if (houses[cupidonPosition] <= 0) {
                    System.out.printf("Place %d already had Valentine's day.", cupidonPosition);
                    System.out.println();
                } else {
                    houses[cupidonPosition] -= 2;
                    if (houses[cupidonPosition] <= 0) {
                        System.out.printf("Place %d has Valentine's day.", cupidonPosition);
                        System.out.println();
                    }
                }
            }
            command = scanner.nextLine();
        }
        int failhouses=0;
        for (int n:houses
             ) {
            if (n!=0){
                failhouses++;
            }
        }
        System.out.printf("Cupid's last position was %d.",cupidonPosition);
        System.out.println();
        if (failhouses==0){
            System.out.println("Mission was successful.");
        }
        else {
            System.out.printf("Cupid has failed %d places.", failhouses);
            System.out.println();
        }

    }
}
