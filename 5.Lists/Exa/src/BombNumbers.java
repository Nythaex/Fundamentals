import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");
        List<Integer> numbs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbs.add(Integer.parseInt(numbers[i]));
        }
        String[] n = scanner.nextLine().split("\\s+");
        List<Integer> bombAndRange = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            bombAndRange.add(Integer.parseInt(n[i]));
        }
        int start = 0;
        int first= 0;
        int second=0;
        while (numbs.contains(bombAndRange.get(0))) {
            if (numbs.get(start) == bombAndRange.get(0)) {
                first=start-bombAndRange.get(1);
                second=start+bombAndRange.get(1);
                if (first<0){
                    first=0;
                }
                if (second>=numbs.size()){
                    second=numbs.size()-1;
                }
                for (int i = second; i >=first; i--) {
                    numbs.remove(i);
                    start=-1;
                }
            }
            start++;
            first = 0;
            second=0;
        }
        int sum = 0;
        for (int numb : numbs
        ) {
            sum += numb;
        }
        System.out.println(sum);
    }
}
