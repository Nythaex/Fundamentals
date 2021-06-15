import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.parseDouble;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first =Double.parseDouble(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);
        double second =Double.parseDouble(scanner.nextLine());
      double sum= calculate(first, second, operation);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(sum));

    }

     static double calculate(double first, double second, char operation) {
        switch (operation) {

            case '+':
                return first+second;

            case '-':
                return first-second;


            case '*':
                return  first*second;

            case '/':
                return first/second;

            default:return 0;

        }

    }


}

