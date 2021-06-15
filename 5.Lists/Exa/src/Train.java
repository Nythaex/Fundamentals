import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wagons = scanner.nextLine();
        int size = Integer.parseInt(scanner.nextLine());
        String[] wagonsArray = wagons.split(" ");
        List<Integer> wagonsList = new ArrayList<>();
        for (int i = 0; i < wagonsArray.length; i++) {
            wagonsList.add(Integer.parseInt(wagonsArray[i]));
        }
        String command = scanner.nextLine();
        while (!(command.equals("end"))) {
            String[] indexes = command.split(" ");
            if (indexes[0].equals("Add")) {
                wagonsList.add(Integer.parseInt(indexes[1]));
            } else {
                for (int i = 0; i < wagonsList.size(); i++) {
                    int totalPasagers = wagonsList.get(i) + Integer.parseInt(indexes[0]);
                    if (totalPasagers <= size) {
                        wagonsList.set(i, totalPasagers);
                        i=wagonsList.size();
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int wagon : wagonsList
        ) {
            System.out.print(wagon + " ");
        }

    }
}
