import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("\\b(?<date>\\d{2})([./-])(?<month>[A-Z][a-z]{2})(\\2)(?<year>\\d{4}\\b)");
        String text=scanner.nextLine();
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s",matcher.group("date"),matcher.group("month"),matcher.group("year"));
            System.out.println();
        }

    }
}
