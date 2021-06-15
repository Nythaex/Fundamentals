import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number=Integer.parseInt(scanner.nextLine());
        BigInteger sumOfFactorial=new BigInteger("1");
        for (int i = Number; i >=2; i--) {
          sumOfFactorial=sumOfFactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sumOfFactorial);

    }
}
