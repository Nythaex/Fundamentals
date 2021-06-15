import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String[] firstArray = first.split(" ");
        String[] secondArray = second.split(" ");
        for (int i = 0; i <= secondArray.length - 1; i++) {
            for (int a = 0; a <= firstArray.length - 1; a++) {
                  if (secondArray[i].equals(firstArray[a])){
                      System.out.print(secondArray[i]+" ");
                  }
            }
        }

    }
}
