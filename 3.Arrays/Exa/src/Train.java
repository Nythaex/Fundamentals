import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int wagons=Integer.parseInt(scanner.nextLine());
        int[] wagonPeople=new int[wagons];
        int sum=-0;
        for (int i = 0; i <wagons; i++) {
          wagonPeople[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <wagons; i++) {
            System.out.print(wagonPeople[i]+" ");
            sum+=wagonPeople[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
