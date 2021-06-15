import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        for (int i = 0; i <= words.length - 1; i++) {
           String theWord=words[i];
           boolean check=true;
            for (int a = 0; a <= theWord.length() - 1; a++) {
                if (((Character.isAlphabetic(theWord.charAt(a))||Character.isDigit(theWord.charAt(a))||theWord.charAt(a)=='-'
                        ||theWord.charAt(a)=='_') &&theWord.length()>=3&&theWord.length()<=16)){

                }
                else {
                    check=false;
                }
            }
            if (check){
                System.out.println(theWord);
            }
        }

    }
}
