import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ArrayAtString = scanner.nextLine();
        String[] ArrayString = ArrayAtString.split(" ");
        int theSum = 0;
        int[] arrayInt = new int[ArrayString.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(ArrayString[i]);
            if (arrayInt[i] % 2 == 0) {
                theSum += arrayInt[i];
            }
        }
        System.out.println(theSum);

    }
}
