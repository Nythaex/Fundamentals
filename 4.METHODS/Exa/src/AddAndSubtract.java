import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=sumNums(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
        System.out.println(sum);

    }

    private static int sumNums(int parseInt, int parseInt1,int third) {
        int sum=summThem(parseInt,parseInt1);
       return sum-third;

    }

    private static int summThem(int parseInt, int parseInt1) {
        return parseInt1+parseInt;
    }
}
