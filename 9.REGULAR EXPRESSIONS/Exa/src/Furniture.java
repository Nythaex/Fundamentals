import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        Pattern pattern=Pattern.compile("^>>(?<product>[A-z]+)<<(?<price>\\d+\\.*\\d*)!(?<quant>\\d+)");
        Matcher matcher=pattern.matcher(text);
        double total = 0d;
        List<String> prod=new ArrayList<>();
        while (!text.equals("Purchase")) {
            if (matcher.find()) {
                prod.add(matcher.group("product"));
                total += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quant"));
            }
            text=scanner.nextLine();
            matcher=pattern.matcher(text);
        }
        System.out.println("Bought furniture:");
        for (String a:prod
             ) {
            System.out.println(a);
        }
        System.out.printf("Total money spend: %.2f",total);
    }
}
