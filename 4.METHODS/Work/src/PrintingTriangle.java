import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number ; i++) {
            PrintingTriangl(i);
        }
        for (int i = number-1;i>=1; i--) {
            PrintingTriangl(i);
        }

    }

    private static void PrintingTriangl(int number) {
        for (int i = 1; i <=number; i++) {
            System.out.print(i);
            if (i<number){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
