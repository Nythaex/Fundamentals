import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int products=Integer.parseInt(scanner.nextLine());
        List<String> productsName=new ArrayList<>();
        for (int i = 0; products > i; i++) {
            String name=scanner.nextLine();
            productsName.add(name);
        }
        Collections.sort(productsName);
        for (int i = 0; i<productsName.size(); i++) {
            System.out.printf("%d.%s",i+1,productsName.get(i));
            System.out.println();
        }
    }
}
