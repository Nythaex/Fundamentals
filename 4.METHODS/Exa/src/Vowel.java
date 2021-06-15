import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(findVowels(scanner.nextLine().toLowerCase()));
    }

    private static int findVowels(String nextLine) {
        int vowels=0;
        for (int i = 0; i <= nextLine.length() - 1; i++) {
            switch (nextLine.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                default:
            }
        }
        return vowels;
    }
}
