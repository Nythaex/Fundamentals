import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i=0;i<=String.valueOf(num).length()-1;i++){
            char chary=String.valueOf(num).charAt(i);
            sum+=(chary-48);
        }
        System.out.println(sum);
    }
}
