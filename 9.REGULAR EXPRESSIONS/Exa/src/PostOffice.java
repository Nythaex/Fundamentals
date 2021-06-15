import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\|");
        Pattern first = Pattern.compile("(?<symb>[#$*%&])(?<let>[A-z]+)\\1");
        Pattern second = Pattern.compile("(?<char>\\d{2}):(?<length>\\d{2})");
        Map<Character, Integer> info = new LinkedHashMap<>();
        Matcher matcher = first.matcher(array[0]);
        String theCode;
        matcher.find();
        theCode = matcher.group("let");
        char symb = matcher.group("symb").charAt(0);

        for (int a = 0; a < theCode.length(); a++) {
            if (theCode.charAt(a) != symb) {
                matcher = second.matcher(array[1]);
                while (matcher.find()) {
                    char check = (char) Integer.parseInt(matcher.group("char"));
                    if (theCode.charAt(a) == check) {
                        if (matcher.group("length").charAt(0) == 0) {
                            info.put(theCode.charAt(a), (int) matcher.group("length").charAt(1) + 1);
                        } else {
                            info.put(theCode.charAt(a), Integer.valueOf(matcher.group("length")) + 1);
                        }
                    }
                }

            }
        }

        String[] theText = array[2].split("\\s+");

        for (Map.Entry<Character, Integer> entry : info.entrySet()) {
            for (int i = 0; i <= theText.length - 1; i++) {
                if (theText[i].charAt(0) == entry.getKey() && theText[i].length() == entry.getValue()) {
                    System.out.println(theText[i]);
                }
            }
        }
    }
}
