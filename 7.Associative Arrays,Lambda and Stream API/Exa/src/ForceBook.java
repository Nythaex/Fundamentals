import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> sides = new TreeMap<>();
        String command = scanner.nextLine();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains(" | ")) {
                String[] tokens = command.split(" \\| ");
                sides.putIfAbsent(tokens[0], new TreeSet<>());
                sides.get(tokens[0]).add(tokens[1]);
            } else {
                String[] tokens = command.split(" -> ");
                for (Map.Entry<String, Set<String>> entry : sides.entrySet()) {
                    if (entry.getValue().contains(tokens[0])) {
                        entry.getValue().remove(tokens[0]);
                    }
                }
                sides.putIfAbsent(tokens[1], new TreeSet<>());
                sides.get(tokens[1]).add(tokens[0]);
                System.out.printf("%s joins the %s side!%n",tokens[0],tokens[1]);

            }
            command = scanner.nextLine();
        }
        sides.entrySet().stream()
                .filter(p1->!p1.getValue().isEmpty())
                .sorted((p1,p2)->Integer.compare(p2.getValue().size(),p1.getValue().size()))
                .forEach(p1->{
                    Iterator<String> iteratore=p1.getValue().iterator();
                    System.out.println("Side: "+p1.getKey()+", Members: "+p1.getValue().size());
                    p1.getValue().forEach(s -> System.out.println("! "+iteratore.next()));
                });

    }
}
