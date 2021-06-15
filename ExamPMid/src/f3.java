import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class f3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] booksi = scanner.nextLine().split(":");
        List<String> cards = new ArrayList<>();
        for (int i = 0; i <= booksi.length - 1; i++) {
            cards.add(booksi[i]);
        }
        List<String> deck = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("Ready")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Add")) {
                if (cards.contains(tokens[1])) {
                    deck.add(tokens[1]);
                    cards.remove(tokens[1]);
                } else {
                    System.out.println("Card not found.");
                }
            } else if (tokens[0].equals("Insert")) {
                if (cards.contains(tokens[1]) && Integer.parseInt(tokens[2]) < deck.size() && Integer.parseInt(tokens[2]) >= 0) {
                    deck.add(Integer.parseInt(tokens[2]), tokens[1]);
                    cards.remove(tokens[1]);
                } else {
                    System.out.println("Error!");
                }
            } else if (tokens[0].equals("Remove")) {
                if (deck.contains(tokens[1])) {
                    deck.remove(tokens[1]);
                } else {
                    System.out.println("Card not found.");
                }
            } else if (tokens[0].equals("Swap")) {
                if (deck.contains(tokens[1]) && deck.contains(tokens[2])) {
                    int first = 0;
                    int second = 0;
                    for (int i = 0; i <= deck.size() - 1; i++) {
                        if (deck.get(i).equals(tokens[1])) {
                            first = i;
                        }
                        if (deck.get(i).equals(tokens[2])) {
                            second =i;
                        }
                    }
                   String cont=deck.get(first);
                    deck.set(first, deck.get(second));
                    deck.set(second, cont);
                }
            } else if (tokens[0].equals("Shuffle")) {
                Collections.reverse(deck);
            }
            command = scanner.nextLine();
        }
        String print=String.join(" ",deck);
        System.out.println(print);
    }
}
