import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> raceInfo = new LinkedHashMap<>();
        Pattern regex = Pattern.compile("[A-Za-z]");
        Pattern regexSecond = Pattern.compile("\\d");
        String comand = scanner.nextLine();
        while (!comand.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            Matcher matcher = regex.matcher(comand);
            int km = 0;
            while (matcher.find()) {
                name.append(matcher.group());
            }
            if (names.contains(String.valueOf(name))) {
                matcher = regexSecond.matcher(comand);
                while (matcher.find()) {
                    km += Integer.parseInt(matcher.group());
                }
                Integer add = raceInfo.get(String.valueOf(name));
                if (add == null) {
                    add = 0;
                }
                raceInfo.put(String.valueOf(name), add + km);
            }
            comand = scanner.nextLine();
        }
        List<String> namese = raceInfo.entrySet().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
                .map(Map.Entry::getKey)
                .limit(3)
                .collect(Collectors.toList());

        int i = 0;
        for (String n : names
        ) {
            switch (i) {
                case 0:
                    System.out.println("1st place: " + namese.get(i));
                    break;
                case 1:
                    System.out.println("2nd place: " + namese.get(i));
                    break;
                case 2:
                    System.out.println("3rd place: " + namese.get(i));
                    break;

            }
            i+=1;
        }


    }


}

