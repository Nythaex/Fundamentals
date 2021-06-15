import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();
        List<Order> listOfOrders = new ArrayList<>();
        while (!comand.equals("buy")) {
            String[] tokens = comand.split("\\s+");
            Order theOrder = new Order(tokens[0], Double.parseDouble(tokens[1]), Integer.parseInt(tokens[2]));

            int quatility = Integer.parseInt(tokens[2]);
            int indexOfOrder = -1;
            for (int i = 0; i < listOfOrders.size(); i++) {
                if (listOfOrders.get(i).name.equals(tokens[0])) {
                   // theOrder.quality = quatility + listOfOrders.get(i).quality; //-без сетър
                    theOrder.setQuality(quatility + listOfOrders.get(i).quality); //-със сетър
                    listOfOrders.set(i, theOrder);
                    indexOfOrder = i;
                }
            }
            if (indexOfOrder == -1) {
                listOfOrders.add(theOrder);
            }
            comand = scanner.nextLine();
        }
        for (Order n:listOfOrders
             ) {
            System.out.printf("%s -> %.2f",n.name,n.quality*n.price);
            System.out.println();
        }

    }

    static class Order {
        String name;
        double price;
        int quality;

        Order(String name, double price, int quality) {
            this.name = name;
            this.price = price;
            this.quality = quality;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public double getPrice() {
            return price;
        }

        public int getQuality() {
            return quality;
        }
    }

}


