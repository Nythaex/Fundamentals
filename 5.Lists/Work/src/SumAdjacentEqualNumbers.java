import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbs = new ArrayList<>();
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        for (int i = 0; strArray.length - 1 >= i; i++) {
            numbs.add(Double.parseDouble(strArray[i]));
        }
        int i = 0;
        while (i < numbs.size()-1) {

            double now = numbs.get(i);
            double next = numbs.get(i + 1);
            if (now == next) {
                numbs.remove(i);
                numbs.set(i, now + next);
                i = 0;
            } else {
                i++;
            }
        }
        for (double num : numbs
        ) {
            DecimalFormat df = new DecimalFormat("###.#");
            System.out.print(df.format(num)+" ");
        }

    }
}
