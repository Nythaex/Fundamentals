import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newOne = new StringBuilder();
        for (int i = 0; i <= text.length() - 1; i++) {
            if (i != 0) {
                if (text.charAt(i - 1) != text.charAt(i))
                {
                    newOne.append(text.charAt(i));
                }
            } else {
                newOne.append(text.charAt(i));
            }
        }
        System.out.println(newOne);
    }
}
