import java.util.Arrays;
import java.util.Scanner;

public class MyProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array=toIntArray(scanner.nextLine());
        System.out.println(Arrays.toString(array));

    }

    public static int[] toIntArray(String str) {
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];
        {
            for (int i = 0; i <= strArray.length - 1; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            return intArray;
        }
    }
}
