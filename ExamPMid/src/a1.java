import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        int sumOfAll=first+second+third;
        int hours=0;
        int i=1;
        while (students>0){
            if (i%4!=0){
                students=students-sumOfAll;
            }
            hours++;
            i++;
        }
        System.out.printf("Time needed: %dh.",hours);

/////////1:04:00

    }
}
