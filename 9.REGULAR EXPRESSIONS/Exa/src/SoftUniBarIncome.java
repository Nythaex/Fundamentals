import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern regex = Pattern.compile("^[^.|$%]*%(?<name>[A-Z][a-z]+)%[^.|$%]*<(?<product>\\w+)>[^.|$%]*\\|(?<count>\\d+)\\|[^.|$%\\d]*(?<price>\\d+.*\\d+)\\$$");
        String comand = scanner.nextLine();
        double total = 0;
        while (!comand.equals("end of shift")) {
            Matcher matcher = regex.matcher(comand);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("count"));
                String name = matcher.group("name");
                String product = matcher.group("product");
                System.out.printf("%s: %s - %.2f%n", name, product, price);
                total += price;
            }
            comand = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", total);
    }

    static class Products {
        String name;
        String product;
        int count;
        double price;

        public Products(String name, String product, int count, double price) {
            this.name = name;
            this.product = product;
            this.count = count;
            this.price = price;
        }


    }
}
