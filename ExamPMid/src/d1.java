import java.nio.channels.WritePendingException;
import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Energy=Integer.parseInt(scanner.nextLine());
        String comand=scanner.nextLine();
        int Wons=0;

        while (!comand.equals("End of battle")){
            int damage=Integer.parseInt(comand);
            if (Energy>=damage){
                Energy-=damage;
                Wons++;
                if (Wons%3==0){
                    Energy+=Wons;
                }
            }
            else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",Wons,Energy);
                return;
            }

            comand=scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", Wons,Energy);
    }
}
