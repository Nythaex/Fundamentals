import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nums=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i=0;i<nums;i++){
            char chary=scanner.nextLine().charAt(0);
            sum+=chary;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
