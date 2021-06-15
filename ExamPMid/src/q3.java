import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split("\\|");
        double money = Double.parseDouble(scanner.nextLine());
        double diff=money;
        List<Double> newItems = new ArrayList<>();
        for (int i = 0; i <= items.length - 1; i++) {
            String[] tokens = items[i].split("->");
            switch (tokens[0]) {
                case "Clothes":
                    if (Double.parseDouble(tokens[1]) <= 50&&Double.parseDouble(tokens[1]) <=money) {
                        double newOne = Double.parseDouble(tokens[1]) * 1.40;
                        newItems.add(newOne);
                        money -= Double.parseDouble(tokens[1]);
                    }
                    break;
                case "Shoes":
                    if (Double.parseDouble(tokens[1]) <= 35&&Double.parseDouble(tokens[1]) <=money) {
                        double newOne = Double.parseDouble(tokens[1]) * 1.40;
                        newItems.add(newOne);
                        money -= Double.parseDouble(tokens[1]);
                    }
                    break;
                case "Accessories":
                    if (Double.parseDouble(tokens[1]) <= 20.5&&Double.parseDouble(tokens[1]) <=money) {
                        double newOne = Double.parseDouble(tokens[1]) * 1.40;
                        newItems.add(newOne);
                        money -= Double.parseDouble(tokens[1]);
                    }
                    break;

            }
        }
        for (double n:newItems
             ) {
            money+=n;
            System.out.printf("%.2f ",n);
        }
        System.out.println();
        System.out.printf("Profit: %.2f%n",Math.abs(money-diff));
        if (money>=150){
            System.out.println("Hello, France!");
        }else {
            System.out.println("Time to go.");
        }

    }

}
