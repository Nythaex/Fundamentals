import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double people=Double.parseDouble(scanner.nextLine());
        int elevatorSize = Integer.parseInt(scanner.nextLine());
        int left=(int) Math.ceil(people/elevatorSize);
        System.out.println(left);

    }
}
