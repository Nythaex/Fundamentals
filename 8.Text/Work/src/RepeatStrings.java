import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []tokens=scanner.nextLine().split(" ");
        for (int i = 0; i <= tokens.length - 1; i++) {
            for (int a = 0; a <= tokens[i].length()-1; a++) {
                System.out.print(tokens[i]);
            }
        }

    }
}
