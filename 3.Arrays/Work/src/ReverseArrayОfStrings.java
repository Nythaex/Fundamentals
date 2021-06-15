import java.util.Scanner;

class blqblq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        String[] arrayAtString = nums.split(" ");
        for (int i = 0; i <= (arrayAtString.length - 1) / 2; i++) {
            String TheOtherHalf = arrayAtString[arrayAtString.length - 1 - i];
            String Last = arrayAtString[i];
            arrayAtString[i] = TheOtherHalf;
            arrayAtString[arrayAtString.length - 1 - i] = Last;
        }
        String name = String.join(" ", arrayAtString);
        System.out.println(name);
    }
}
