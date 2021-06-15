import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findTopInt(Integer.parseInt(scanner.nextLine()));
    }

    private static void findTopInt(int parseInt) {

        for (int i = 15; i <= parseInt; i++) {
            int oddNums = 0;
            int print=i;
            int sum = 0;
            while (print != 0) {
                int left = print % 10;
                sum += left;
                print /= 10;
                if (left % 2 == 1) {
                    oddNums++;
                }
            }
            if (sum%8==0&&oddNums>=1){
                System.out.println(i);
            }
        }
    }
}
