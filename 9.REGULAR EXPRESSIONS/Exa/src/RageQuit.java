import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder theFinalString=new StringBuilder();
        Pattern regex=Pattern.compile("(?<let>[^\\d]+)(?<dig>[\\d]+)");
        Matcher matcher=regex.matcher(text);
        while (matcher.find()){
            int count=Integer.parseInt(matcher.group("dig"));
            for (int i = 1; i <= count; i++) {
             theFinalString.append(matcher.group("let"));
            }
        }
        String finale=String.valueOf(theFinalString).toUpperCase();
        int count=0;
        List<Character> checker=new ArrayList<>();
        for (int i = 0; i <= finale.length() - 1; i++) {
            char now=finale.charAt(i);
           if (!checker.contains(now)){
               count++;
               checker.add(now);
           }
        }
        System.out.printf("Unique symbols used: %d",count);
        System.out.println();
        System.out.println(finale);
    }
}
