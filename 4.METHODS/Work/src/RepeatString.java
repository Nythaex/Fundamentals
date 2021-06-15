import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int TimesRepeat=Integer.parseInt(scanner.nextLine());
        String repeated=repeating(str,TimesRepeat);
        System.out.println(repeated);

    }

    private static String repeating(String str, int timesRepeat) {
        String[] arrayStr=new String[timesRepeat];
        for (int i = 0; i <= arrayStr.length - 1; i++) {
              arrayStr[i]=str;


        }
        return String.join("",arrayStr);
    }
}
