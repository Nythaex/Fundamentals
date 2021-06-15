import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstOne = scanner.nextLine().split("\\s+");
        List<Integer> first = new ArrayList<>();
        for (int i = 0; i <= firstOne.length - 1; i++) {
            first.add(Integer.parseInt(firstOne[i]));
        }

        String[] secondOne = scanner.nextLine().split("\\s+");
        List<Integer> second = new ArrayList<>();
        for (int i = 0; i <= secondOne.length - 1; i++) {
            second.add(Integer.parseInt(secondOne[i]));
        }
        int sum = 0;
        while (second.size() != 0 && first.size() != 0) {
            if (second.get(0) > first.get(0)) {
                second.add(second.get(0));
                second.add(first.get(0));
                first.remove(0);
                second.remove(0);
            } else if (first.get(0) > second.get(0)) {
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);
            } else {
                first.remove(0);
                second.remove(0);
            }
        }
        if (first.size()==0){
            for (int card:second
                 ) {
                sum+=card;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }else {
            for (int card:first
            ) {
                sum+=card;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }

    }
}
