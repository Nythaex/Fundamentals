import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String[] firstArray = first.split(" ");
        String[] secondArray = second.split(" ");
        int[] firstInt = new int[firstArray.length];
        int sum = 0;

        for (int i = 0; i <= firstArray.length - 1; i++) {
            firstInt[i] = Integer.parseInt(firstArray[i]);
        }

        for (int i = 0; i <= firstArray.length - 1; i++) {
            if (!(firstArray[i].equals(secondArray[i])))
            {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
            sum += firstInt[i];
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
