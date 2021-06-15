import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String array[]=new String[]{"Invalid day!","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int day=Integer.parseInt(scanner.nextLine());
        if (day<1||day>7){
            System.out.println("Invalid day!");
            return;
        }
        System.out.println(array[day]);
        
    }
}
