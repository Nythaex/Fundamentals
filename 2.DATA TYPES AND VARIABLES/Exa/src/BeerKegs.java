import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        String biggest = "";
        double biggestInt = 0;
        for (int i = 1; i <= times; i++) {
            String model = scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            double height=Double.parseDouble(scanner.nextLine());
            if (Math.PI * Math.pow(radius, 2) * height > biggestInt) {
                biggest = model;
                biggestInt = Math.PI * Math.pow(radius, 2) * height;
            }
        }
        System.out.println(biggest);
    }
}
