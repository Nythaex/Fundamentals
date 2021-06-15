import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MixedupList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splited = scanner.nextLine().split(" ");
        List<Integer> first = new ArrayList<>();
        for (int i = 0; i <= splited.length - 1; i++) {
            first.add(Integer.parseInt(splited[i]));
        }

        String[] splitet = scanner.nextLine().split(" ");
        List<Integer> second = new ArrayList<>();
        for (int i = 0; i <= splitet.length - 1; i++) {
            second.add(Integer.parseInt(splitet[i]));
        }
        List<Integer> finalList = new ArrayList<>();
        int count = 0;
        while (count < second.size() && count < first.size()) {
            finalList.add(first.get(count));
            first.remove(count);
            finalList.add(second.get(second.size() - 1 - count));
            second.remove(second.size() - 1 - count);

        }
        int start = 0;
        int end = 0;
        if (first.size() == 2) {
            Collections.sort(first);
            start = first.get(0);
            end = first.get(1);

        } else {
            Collections.sort(second);
            start = second.get(0);
            end = second.get(1);
        }
        Collections.sort(finalList);
        for (int i = 0; i < finalList.size(); i++) {
            if (finalList.get(i)>start&&finalList.get(i)<end){
                System.out.print(finalList.get(i));
                if (i!=finalList.size()-1){
                    System.out.print(" ");
                }
            }
        }


    }
}
