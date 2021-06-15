import java.util.Collections;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        double sum=0;
        for (int p = 0; p <= words.length - 1; p++) {
            int start = 0;
            int end = 0;
            String theWord = words[p];
            for (int a = 0; a <= theWord.length() - 1; a++) {
                if (Character.isDigit(theWord.charAt(a))) {
                    start = a;
                    break;
                }
            }
            for (int a = theWord.length() - 1; a >= 0; a--) {
                if (Character.isDigit(theWord.charAt(a))) {
                    end = a;
                    break;
                }
            }
            String first = theWord.substring(0, start);
            String second = theWord.substring(end + 1, theWord.length());
            double num = Integer.parseInt(theWord.substring(start, end + 1));

            for (int i = 0; i <= first.length() - 1; i++) {
                double value = 0;
                if (Character.isLowerCase(first.charAt(i))) {
                    for (char a = 'a'; a <= first.charAt(i); a++) {
                        value++;
                    }
                    num *= value;
                } else {
                    for (char a = 'A'; a <= first.charAt(i); a++) {
                        value++;
                    }
                    num /= value;
                }

            }
            for (int i = 0; i <= second.length() - 1; i++) {
                double value = 0;
                if (Character.isLowerCase(second.charAt(i))) {
                    for (char a = 'a'; a <= second.charAt(i); a++) {
                        value++;
                    }
                    num += value;
                } else {
                    for (char a = 'A'; a <= second.charAt(i); a++) {
                        value++;
                    }
                    num -= value;
                }

            }
            sum+=num;
        }
        System.out.println(String.format("%.2f",sum));
    }
}
