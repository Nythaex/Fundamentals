import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double> numbers=new ArrayList<>();
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        for (int i = 0; strArray.length - 1 >= i; i++) {
            numbers.add(Double.parseDouble(strArray[i]));
        }
        for (int i = 0; i <= (numbers.size() - 1)/2; i++) {
            if (i!=numbers.size()-1){
                numbers.set(i,numbers.get(i)+numbers.get(numbers.size()-1));
                numbers.remove(numbers.size()-1);
            }

        }
        for (double nums:numbers
             ) {
            DecimalFormat df = new DecimalFormat("###.#");
            System.out.print(df.format(nums)+" ");

        }
    }
}
