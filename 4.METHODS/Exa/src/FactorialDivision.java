import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = calculate(Long.parseLong(scanner.nextLine()), Long.parseLong(scanner.nextLine()));
        System.out.printf("%.2f",result);
    }

    private static double calculate(long parseInt, long parseInt1) {
        double first = 1;
        double second = 1;
        for (long i = parseInt; i > 0; i--) {
            first *= i;
        }
        for (long i = parseInt1; i > 0; i--) {
            second *= i;
        }
        return first/second;
    }
}
