import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double> numbers=new ArrayList<>();
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        for (int i = 0; strArray.length - 1 >= i; i++) {
            numbers.add(Double.parseDouble(strArray[i]));
        }
        List<Double> secondNumbs=new ArrayList<>();
        String secondStr = scanner.nextLine();
        String[] SecondStrArray = secondStr.split(" ");
        for (int i = 0; SecondStrArray.length - 1 >= i; i++) {
           secondNumbs.add(Double.parseDouble(SecondStrArray[i]));
        }
        List<Double> allStortedNums=new ArrayList<>();
        int i=0;
        while (i<numbers.size()||i<secondNumbs.size()){
            if (numbers.size()>i) {
                Double a=numbers.get(i);
                allStortedNums.add(a);
            }
            if (secondNumbs.size()>i) {
                Double b=secondNumbs.get(i);
                allStortedNums.add(b);
            }
            i++;
        }
        for (double num:allStortedNums
             ) {
            DecimalFormat df = new DecimalFormat("###.#");
            System.out.print(df.format(num)+" ");
        }
    }
}
