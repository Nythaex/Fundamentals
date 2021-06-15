import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] bannedWords=scanner.nextLine().split(", ");
        String text=scanner.nextLine();

        for (int i = 0; i <= bannedWords.length-1; i++) {

            StringBuilder n=new StringBuilder();
            for (int a = 0; a < bannedWords[i].length(); a++) {
                n.append("*");
            }
            text=text.replace(bannedWords[i],n);
        }
        System.out.println(text);
    }
}
