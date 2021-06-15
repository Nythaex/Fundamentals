import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int Sum = 0;
        switch (calculation) {
            case "add":
                Sum = addToSum(firstNum, secondNum);
                break;
            case "multiply":
                Sum = multiplyToSum(firstNum, secondNum);
                break;
            case "subtract":
                Sum = SubtractToSum(firstNum, secondNum);
                break;
            case "divide":
                Sum = divideToSum(firstNum, secondNum);
                break;
        }
        System.out.println(Sum);
    }

    private static int divideToSum(int firstNum, int secondNum) {

        return firstNum / secondNum;
    }

    private static int SubtractToSum(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private static int multiplyToSum(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    private static int addToSum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }


}
