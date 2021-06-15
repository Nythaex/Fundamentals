import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitedTar = scanner.nextLine().split(" ");
        int[] targets = new int[splitedTar.length];
        for (int i = 0; i <= splitedTar.length - 1; i++) {
            targets[i] = Integer.parseInt(splitedTar[i]);
        }
        int shots = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int shotIndex = Integer.parseInt(command);
            if (shotIndex > -1 && shotIndex <= targets.length - 1 && targets[shotIndex] != -1) {
                int diff = targets[shotIndex];
                targets[shotIndex] = -1;
                shots += 1;
                for (int i = 0; i <= targets.length - 1; i++) {
                    if (targets[i] != -1) {
                        if (targets[i] > diff) {
                            targets[i] -= diff;
                        } else {
                            targets[i] += diff;
                        }
                    }
                }
            }
            command=scanner.nextLine();
        }
        System.out.print("Shot targets: "+shots + " " + "->" + " ");
        for (int s : targets
        ) {
            System.out.print(s + " ");
        }
    }
}
