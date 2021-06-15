import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=Integer.parseInt(scanner.nextLine());
        int y1=Integer.parseInt(scanner.nextLine());
        int x2=Integer.parseInt(scanner.nextLine());
        int y2=Integer.parseInt(scanner.nextLine());

        if (Math.abs(x1)+Math.abs(y1)<=Math.abs(x2)+Math.abs(y2)){
            System.out.printf("(%d, %d)",x1,y1);
        }
        else {
            System.out.printf("(%d, %d)",x2,y2);
        }
    }
}
