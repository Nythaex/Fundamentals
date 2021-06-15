import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();
        double total = 0;
        while (!comand.equals("regular") && !comand.equals("special")) {
            double price = Double.parseDouble(comand);
            if (price >= 0) {
                total+=price;
            }else {
                System.out.println("Invalid price! ");
            }
            comand=scanner.nextLine();
        }
        if (total==0){
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$",total);
        System.out.println();
        System.out.printf("Taxes: %.2f$",total*0.2);
        System.out.println();
        System.out.println("-----------");
        if (comand.equals("special")){
            System.out.printf("Total price: %.2f$",(total*1.2)-(total*1.2)*0.1);
        }else {
            System.out.printf("Total price: %.2f$",(total*1.2));
        }

    }
}
