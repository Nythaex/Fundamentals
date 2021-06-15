import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start=Integer.parseInt(scanner.nextLine());
        int finale=Integer.parseInt(scanner.nextLine());

        for (int i=start;i<=finale;i++){

            System.out.print((char)i+" ");
        }
    }
}
