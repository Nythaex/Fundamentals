import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfTrip = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        double thePriceOfFuelPerKilometer = Double.parseDouble(scanner.nextLine());
        double foodPrice = Double.parseDouble(scanner.nextLine()) * daysOfTrip * groupOfPeople;
        double roomPrice = Double.parseDouble(scanner.nextLine()) * daysOfTrip * groupOfPeople;
        if (groupOfPeople > 10) {
            roomPrice -= roomPrice * 0.25;
        }
        double curentExpenses = foodPrice + roomPrice;
        for (int i = 1; i <= daysOfTrip; i++) {
            curentExpenses += Double.parseDouble(scanner.nextLine()) * thePriceOfFuelPerKilometer;
            if (i % 3 == 0 || i % 5 == 0) {
                curentExpenses += curentExpenses * 0.4;
            }
            if (i % 7 == 0) {
                curentExpenses -= curentExpenses / groupOfPeople;
            }

        }
        if (budget >= curentExpenses) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - curentExpenses);
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", curentExpenses - budget);
        }

    }
}
