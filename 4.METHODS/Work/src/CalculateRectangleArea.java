import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int sum=rectangleArea(firstNum,secondNum);
        System.out.println(sum);
    }

    private static int rectangleArea(int firstNum,int secondNum) {
        return firstNum*secondNum;
    }
}
