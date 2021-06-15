import java.util.List;
import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xf1 = Integer.parseInt(scanner.nextLine());
        int yf1 = Integer.parseInt(scanner.nextLine());
        int xf2 = Integer.parseInt(scanner.nextLine());
        int yf2 = Integer.parseInt(scanner.nextLine());

        int xs1 = Integer.parseInt(scanner.nextLine());
        int ys1 = Integer.parseInt(scanner.nextLine());
        int xs2 = Integer.parseInt(scanner.nextLine());
        int ys2 = Integer.parseInt(scanner.nextLine());

        if (Math.abs(xf1) + Math.abs(yf1) + Math.abs(xf2) + Math.abs(yf2) >= Math.abs(xs1) + Math.abs(ys1) + Math.abs(xs2) + Math.abs(ys2)) {
            if (Math.abs(xf1) + Math.abs(yf1) <= Math.abs(xf2) + Math.abs(yf2)) {
                System.out.printf("(%d, %d)(%d, %d)", xf1, yf1, xf2, yf2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", xf2, yf2, xf1, yf1);
            }
        } else {
            if (Math.abs(xs1) + Math.abs(ys1) <= Math.abs(xs2) + Math.abs(ys2)) {
                System.out.printf("(%d, %d)(%d, %d)", xs1, ys1, xs2, ys2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", xs2, ys2, xs1, ys1);
            }
        }

    }
}
