import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=Calculate(Math.abs(Integer.parseInt(scanner.nextLine())));
        System.out.println(sum);
    }

    private static int Calculate(int readed) {
        int odd=0;
        int even=0;

       while (readed>0) {
           int left=readed%10;
           readed/=10;
           if (left % 2 == 0) {
               even += left;
           } else {
               odd += left;
           }
       }

        return odd*even;
    }
}
