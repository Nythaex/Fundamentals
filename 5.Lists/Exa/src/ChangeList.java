import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wagons = scanner.nextLine();
        String[] wagonsArray = wagons.split(" ");
        List<Integer> wagonsList = new ArrayList<>();
        for (int i = 0; i < wagonsArray.length; i++) {
            wagonsList.add(Integer.parseInt(wagonsArray[i]));
        }
        String comand = scanner.nextLine();
        while (!(comand.equals("end"))) {
            String[] indexes = comand.split("\\s+");
            if (indexes[0].equals("Delete")) {
                while (wagonsList.contains(Integer.parseInt(indexes[1]))){
                    wagonsList.remove(Integer.valueOf(Integer.parseInt(indexes[1])));
                }

            } else  {

                    wagonsList.add(Integer.parseInt(indexes[2]), Integer.parseInt(indexes[1]));

            }
            comand=scanner.nextLine();
        }
        for (int numb:wagonsList) {
            System.out.print(numb+" ");
        }

    }
}
