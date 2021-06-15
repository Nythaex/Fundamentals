import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> chars = new LinkedHashMap<>();
        String lista = scanner.nextLine();
        for (char s : lista.toCharArray()) {
            if (s != ' ') {
                if (chars.containsKey(s)) {
                    int count = chars.get(s);
                    chars.put(s, count += 1);
                } else {
                    chars.put(s, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
