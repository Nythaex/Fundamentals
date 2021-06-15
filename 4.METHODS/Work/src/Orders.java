import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        finishingOrder(scanner.nextLine(),Integer.parseInt(scanner.nextLine()));
    }

    private static void finishingOrder(String product, int numberOfTheStuff) {
         switch (product){
             case "coffee":
                 System.out.printf("%.2f",numberOfTheStuff*1.50);
                 break;
             case "water":
                 System.out.printf("%.2f",numberOfTheStuff*1.00);
                 break;
             case "coke":
                 System.out.printf("%.2f",numberOfTheStuff*1.40);
                 break;
             case "snacks":
                 System.out.printf("%.2f",numberOfTheStuff*2d);
                 break;

         }
    }
}
