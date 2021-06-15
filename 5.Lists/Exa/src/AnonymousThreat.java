import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventar = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                int finalIndex = Integer.parseInt(tokens[2]);
                if (finalIndex >= inventar.size()) {
                    finalIndex = inventar.size() - 1;
                }
                for (int i = 0; i < finalIndex - startIndex; i++) {
                    inventar.set(startIndex, inventar.get(startIndex) + inventar.get(startIndex + 1));
                    inventar.remove(startIndex + 1);
                }
            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = (int) Math.ceil(inventar.get(index).length() / Integer.parseInt(tokens[2]));//по колко да са
                int part = Integer.parseInt(tokens[2]);//колко да са
                int a = 0;
                for (int i = 1; i <= part; i++) {
                    int counter = 1;
                    if (i != part) {
                        String add = "";
                        for (; a <= inventar.get(index).length() - 1; a++) {
                            add += inventar.get(index).charAt(a);
                            if (counter == partitions) {
                                a++;
                                break;
                            }
                            counter++;
                        }
                        inventar.add(index + i, add);
                    } else {
                        String add = inventar.get(index).substring(a);
                        inventar.add(index + i, add);
                    }
                }
                inventar.remove(index);
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", inventar));
    }
}