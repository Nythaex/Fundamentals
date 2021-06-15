import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsOfString = scanner.nextLine().split("\\s+");
        Random random = new Random();
        for (int i = 0; i <= wordsOfString.length - 1; i++) {
            int first=random.nextInt(wordsOfString.length);
            int second=random.nextInt(wordsOfString.length);
            String old=wordsOfString[first];
            wordsOfString[first]=wordsOfString[second];
            wordsOfString[second]=old;
        }
        for (String word:wordsOfString
             ) {
            System.out.println(word);
        }
    }
}
