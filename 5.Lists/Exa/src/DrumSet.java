import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyLeft = Double.parseDouble(scanner.nextLine());
        String[] splited = scanner.nextLine().split(" ");
        List<Integer> drums = new ArrayList<>();
        List<Integer> drumsQuality = new ArrayList<>();
        for (int i = 0; i <= splited.length - 1; i++) {
            drums.add(Integer.parseInt(splited[i]));
            drumsQuality.add(Integer.parseInt(splited[i]));
        }

        String command = scanner.nextLine();
        while (!command.equals("Hit it again, Gabsy!")) {
            int smash = Integer.parseInt(command);
            for (int i = 0; i <= drums.size() - 1; i++) {
                drums.set(i, drums.get(i) - smash);
                if (drums.get(i) <= 0) {
                    if (moneyLeft < drumsQuality.get(i) * 3) {
                        drums.remove(i);
                        drumsQuality.remove(i);
                        i--;
                    } else {
                        drums.set(i, drumsQuality.get(i));
                        moneyLeft -= drumsQuality.get(i) * 3;
                    }

                }
            }
            command = scanner.nextLine();
        }


        for (int n : drums
        ) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", moneyLeft);
    }
}
