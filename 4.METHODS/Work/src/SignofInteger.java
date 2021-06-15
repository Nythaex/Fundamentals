import java.util.Scanner;

public class SignofInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        printNumber(number);

    }
    public static void printNumber(int num){
        if (num<0){
            System.out.printf("The number %d is negative.",num);
        }
        else if (num==0){
            System.out.printf("The number %d is zero.",num);
        }
        else {
            System.out.printf("The number %d is positive.",num);
        }
    }
}
