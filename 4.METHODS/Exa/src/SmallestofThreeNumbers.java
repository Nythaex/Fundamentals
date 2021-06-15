import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());
        int smallestNumber=findSmallestNum(first,second,third);
        System.out.println(smallestNumber);

    }

    private static int findSmallestNum(int first, int second, int third) {
        int smallestNum=-2000000000;
        if (first>second){
            smallestNum=second;
        }
        else {
            smallestNum=first;
        }
        if (smallestNum>third){
            smallestNum=third;
        }

        return smallestNum;
    }
}
