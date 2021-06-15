import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbs = new ArrayList<>();
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        for (int i = 0; strArray.length - 1 >= i; i++) {
            numbs.add(Integer.parseInt(strArray[i]));
        }
        int i = 0;
        while (i <= numbs.size()-1) {
            if (numbs.get(i)<0) {
                numbs.remove(i);
            } else {
                i++;
            }
        }
        Collections.reverse(numbs);
        if (numbs.size()==0){
            System.out.println("empty");
        }
        else {
            for (int num:numbs) {
                System.out.print(num+" ");
            }
        }
    }
}
