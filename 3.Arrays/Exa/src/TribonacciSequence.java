import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        recurse(4, num, 0, 1, 1, 2);
    }

    private static void recurse(int newNum, int num, int start, int first, int second, int third) {

        if (start > 3 && start <= num) {
            start += 1;
            first = second;
            second = third;
            third = newNum;
            System.out.print(newNum + " ");
            newNum = first + second + third;
            if (start <= num) {
                recurse(newNum, num, start, first, second, third);
            }
        } else {
            if (start == 1) {
                System.out.print("1 ");
            } else if (start == 2) {
                System.out.print("1 ");
            } else if (start == 3) {
                System.out.print("2 ");

            }
            start++;
            if (start <= num) {
                recurse(newNum, num, start, first, second, third);
            }

        }
    }

}

