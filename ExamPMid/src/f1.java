import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int month=Integer.parseInt(scanner.nextLine());
        double total=0;
        for (int i = 1; i <= month; i++) {
            if (i%2!=0&&i!=1){
                total-=total*0.16;
            }
            if (i%4==0){
                total+=total*0.25;
            }

            total+=money*0.25;
        }
        if (total>=money) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", total - money);
        }
        else {
            System.out.printf("Sorry. You need %.2flv. more.",money-total);
        }
    }
}
