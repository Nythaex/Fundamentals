import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MainExaFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = Integer.parseInt(scanner.nextLine());
        int array[] = new int[sizeArray];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int i=0;i<array.length/2;i++){
            int oldNum=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=oldNum;

        }
        for (int num:array) {
            System.out.println(num);
        }

    }
}
