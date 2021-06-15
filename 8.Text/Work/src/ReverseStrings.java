import java.util.Arrays;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String comand=scanner.nextLine();
        while (!comand.equals("end")){
            System.out.print(comand+" = ");
            for (int i = comand.length()-1; i>=0; i--) {
                System.out.print(comand.charAt(i));
            }
            System.out.println();
            comand=scanner.nextLine();
        }

    }
}
