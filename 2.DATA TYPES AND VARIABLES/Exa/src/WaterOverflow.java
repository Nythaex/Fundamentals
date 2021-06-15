import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < lines; i++) {
            int newLiters = Integer.parseInt(scanner.nextLine());
            if (newLiters + sum > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += newLiters;
            }
        }
        System.out.println(sum);
    }
}
