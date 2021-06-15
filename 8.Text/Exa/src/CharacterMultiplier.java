import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        System.out.println(multiBoth(first, second));


    }


    private static int multiBoth(String first, String second) {
        int totalSum = 0;


        for (int i = 0; i <= Math.min(first.length()-1,second.length()-1); i++) {
            totalSum += first.charAt(i) * second.charAt(i);
        }

        if (first.length() > second.length()) {
                for (int a = second.length(); a<= first.length() - 1; a++) {
                 totalSum+=first.charAt(a);
                }

        } else {
            for (int a = first.length(); a<= second.length() - 1; a++) {
                totalSum+=second.charAt(a);
            }
        }

        return totalSum;
    }
}
