import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String veh = scanner.nextLine();
        List<Cars> catalogue = new ArrayList<>();
        int carPower = 0;
        int truckPower = 0;
        double cars = 0;
        double trucks = 0;
        while (!veh.equals("End")) {
            String[] splited = veh.split(" ");
            Cars car = new Cars(splited[0], splited[1], splited[2], Integer.parseInt(splited[3]));
            catalogue.add(car);
            if (car.type.equals("car")) {
                carPower += car.horsePower;
                cars += 1;
            } else if (car.type.equals("truck")){
                truckPower += car.horsePower;
                trucks += 1;
            }
            veh = scanner.nextLine();
        }
        veh = scanner.nextLine();
        while (!veh.equals("Close the Catalogue")) {
            for (Cars car:catalogue
            ) {
                if (veh.equals(car.model)){
                    if (car.type.equals("car")){
                        System.out.println("Type: Car");
                    }
                    else {
                        System.out.println("Type: Truck");
                    }
                    System.out.printf("Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d%n",car.model,car.color,car.horsePower);
                }
            }

            veh = scanner.nextLine();
        }
        if (carPower!=0 ) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carPower / cars);
        }
        else {
            System.out.printf("Cars have average horsepower of: %.2f.",0D);
            System.out.println();
        }
        if (trucks!=0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", truckPower / trucks);
        }
        else {
            System.out.printf("Trucks have average horsepower of: %.2f.",0D);
            System.out.println();
        }

    }

    static class Cars {
        String type;
        String model;
        String color;
        int horsePower;

        public Cars(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }
    }
}
