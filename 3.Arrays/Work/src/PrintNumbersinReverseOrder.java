import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = Integer.parseInt(scanner.nextLine());
        int array[] = new int[sizeArray];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
