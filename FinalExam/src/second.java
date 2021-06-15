import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());
        Pattern regex=Pattern.compile("^([%$])(?<name>[A-Z][a-z]{2,})\\1: \\[(?<first>\\d+)\\]\\|\\[(?<second>\\d+)\\]\\|\\[(?<third>\\d+)\\]\\|$");
        for (int i = 0; i <count; i++) {
          String text=scanner.nextLine();
            Matcher matcher=regex.matcher(text);
            if (matcher.find()){
                StringBuilder forPrinting=new StringBuilder();
                char first= (char) Integer.parseInt(matcher.group("first"));
                char second=(char) Integer.parseInt(matcher.group("second"));
                char third=(char) Integer.parseInt(matcher.group("third"));
                forPrinting.append(first);
                forPrinting.append(second);
                forPrinting.append(third);
                System.out.println(matcher.group("name")+": "+forPrinting.toString());
            }else {
                System.out.println("Valid message not found!");
            }
        }

    }
}
