import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <num; i++) {
            int number=1;
            for (int a = 0; a <= i; a++) {
                System.out.print(number+" ");
                number=number*(i-a)/(a+1);
            }
            System.out.println();

        }


    }
}
