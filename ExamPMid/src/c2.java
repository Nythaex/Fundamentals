import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = scanner.nextLine().split("!");
        List<String> productsList = new ArrayList<>();
        for (int i = 0; i <= products.length - 1; i++) {
            productsList.add(products[i]);
        }
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
          String []splited=command.split(" ");
          if (splited[0].equals("Urgent")){
              if (!productsList.contains(splited[1])){
                  productsList.add(0,splited[1]);
              }
          }
          else if (splited[0].equals("Unnecessary")){
              if (productsList.contains(splited[1])){
                  productsList.remove(splited[1]);
              }
          }
          else if (splited[0].equals("Correct")){
              for (int i = 0; i <= productsList.size()-1; i++) {
                  if (productsList.get(i).equals(splited[1])){
                      productsList.set(i,splited[2]);
                  }
              }
          }
          else if (splited[0].equals("Rearrange")){
                for (int i = 0; i <= productsList.size()-1; i++) {
                    if (productsList.get(i).equals(splited[1])){
                        productsList.remove(i);
                        productsList.add(splited[1]);
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= productsList.size() - 1; i++) {
            System.out.print(productsList.get(i));
          if (i!=productsList.size()-1){
              System.out.print(", ");
          }

        }

    }
}
