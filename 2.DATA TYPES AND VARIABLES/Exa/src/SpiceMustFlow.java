import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long spice = Long.parseLong(scanner.nextLine());
        Long total=0l;
        int day = 0;
        while (spice >= 100) {

            total += (spice - 26);
            day++;
            spice -= 10;
        }
        if(total>26){
            total -= 26;
        }

        System.out.println(day);
        System.out.println(total);
    }
}
