import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        if (first == 0 || second == 0 || third == 0) {
            System.out.println("zero");
            return;
        }
        if (first < 0) {
            counter++;
        }
        if (second < 0) {
            counter++;
        }
        if (third < 0) {
            counter++;
        }
        if (counter==1 || counter==3){
            System.out.println("negative");
            return;
        }
        System.out.println("positive");

    }
}
