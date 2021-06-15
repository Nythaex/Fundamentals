import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern regex=Pattern.compile("\\b[A-Za-z][\\w._-]*\\w@[A-Za-z][\\w.-]+\\.\\w+");
        String text=scanner.nextLine();
        Matcher matcher=regex.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
