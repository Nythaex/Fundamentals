import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String theWord=scanner.nextLine();
        for (int i = 0; i <= theWord.length() - 1; i++) {
            char cha=theWord.charAt(i);
            System.out.printf("%c",cha+3);
        }



    }
}
