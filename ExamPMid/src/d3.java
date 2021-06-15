import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitedTar = scanner.nextLine().split(" ");
        List<Integer> targets = new ArrayList<>();
        for (int i = 0; i <= splitedTar.length - 1; i++) {
            targets.add(Integer.parseInt(splitedTar[i]));
        }
        int shots = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] splited = command.split(" ");
            int shotIndex = Integer.parseInt(splited[1]);
            if (splited[0].equals("Shoot")) {
                if (shotIndex >= 0 && shotIndex < targets.size()) {
                    int targeti = targets.get(shotIndex);
                    targeti -= Integer.parseInt(splited[2]);
                    targets.set(shotIndex, targeti);
                    if (targets.get(shotIndex) <= 0) {
                        targets.remove(shotIndex);
                    }
                }
            } else if (splited[0].equals("Add")) {
                if (shotIndex >= 0 && shotIndex < targets.size()) {
                    targets.add(shotIndex, Integer.parseInt(splited[2]));
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (splited[0].equals("Strike")) {
                if (shotIndex - Integer.parseInt(splited[2]) >= 0 && shotIndex + Integer.parseInt(splited[2]) < targets.size()) {
                    int count = 0;
                    for (int i = shotIndex - Integer.parseInt(splited[2]); i <= shotIndex + Integer.parseInt(splited[2]); i++) {
                        count++;
                    }
                    for (int i = 1; i <= 3; i++) {
                        targets.remove(shotIndex - Integer.parseInt(splited[2]));
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= targets.size() - 1; i++) {
            System.out.print(targets.get(i));
            if (i != targets.size() - 1) {
                System.out.print("|");
            }
        }
    }
}//////////1:36:00
