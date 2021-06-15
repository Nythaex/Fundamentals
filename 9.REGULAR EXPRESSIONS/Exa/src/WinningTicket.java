import javafx.css.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tickets = scanner.nextLine().split("[, ]+");
        Pattern regex = Pattern.compile("[\\\\\\\\@]{6,}|[\\\\\\\\$]{6,}|[\\\\\\\\#]{6,}|[\\\\\\\\^]{6,}");
        for (int i = 0; i < tickets.length ; i++) {
            if (tickets[i].length() == 20) {
                String first = tickets[i].substring(0, 10);
                String second = tickets[i].substring(10, 20);
                String leftMach ="a";
                String righttMach="s";

                Matcher lm = regex.matcher(first);
                Matcher rm = regex.matcher(second);

                if (lm.find()) {
                    leftMach=lm.group();
                }
                if (rm.find()) {
                    righttMach = rm.group();
                }
                if (leftMach.substring(0,1).equals(righttMach.substring(0,1))){
                    int matchCount = Math.min(leftMach.length(),righttMach.length());

                    if (matchCount == 10){
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n",tickets[i],matchCount,leftMach.substring(0,1));
                    }else {
                        System.out.printf("ticket \"%s\" - %d%s%n",tickets[i],matchCount,leftMach.substring(0,1));

                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match", tickets[i]);
                    System.out.println();
                }
            } else {
                System.out.println("invalid ticket");
            }
        }


    }
}
