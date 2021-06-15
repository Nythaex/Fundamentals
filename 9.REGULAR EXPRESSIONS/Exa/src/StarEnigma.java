import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messages = Integer.parseInt(scanner.nextLine());
        Pattern regex1 = Pattern.compile("[TtSsAaRr]");
        List<String> destroyed = new ArrayList<>();
        List<String> attacked = new ArrayList<>();
        for (int i = 1; i <= messages; i++) {
            String messeg = scanner.nextLine();
            Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]*)[^-@!:>]*:(?<polulation>\\d+)[^-@!:>]*!(?<action>[AD])![^-@!:>]*->(?<sold>\\d+)*");
            int count = 0;
            Matcher matcher = regex1.matcher(messeg);
            while (matcher.find()) {
            count++;
            }

            StringBuilder decrypd = new StringBuilder();
            for (char n : messeg.toCharArray()
            ) {
                char chary= (char) (n-count);
                decrypd.append(chary);
            }
            matcher = pattern.matcher(decrypd);
            if (matcher.find()) {
                if (matcher.group("action").equals("A")) {
                    attacked.add(matcher.group("planetName"));
                } else if (matcher.group("action").equals("D")) {
                    destroyed.add(matcher.group("planetName"));
                }
            }
        }
        Collections.sort(attacked);
        Collections.sort(destroyed);
        System.out.println("Attacked planets: "+attacked.size());
        for (String n:attacked
             ) {
            System.out.println("-> "+n);
        };
        System.out.println("Destroyed planets: "+destroyed.size());
        for (String n:destroyed
        ) {
            System.out.println("-> "+n);
        };

    }
}
