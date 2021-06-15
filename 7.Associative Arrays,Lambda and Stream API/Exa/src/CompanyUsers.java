import javax.crypto.spec.PSource;
import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> comapnies = new TreeMap<>();
        String comand = scanner.nextLine();
        while (!comand.equals("End")) {
            String[] tokens = comand.split(" -> ");
            String companyName = tokens[0];
            String empName = tokens[1];
            List<String> check = comapnies.get(companyName);
            if (check == null) {
                check = new ArrayList<>();
                comapnies.put(companyName, check);
            }
            if (!check.contains(empName)) {
                check.add(empName);
            }
            comand = scanner.nextLine();
        }
        comapnies.entrySet()
                .stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue()
                            .stream()
                            .forEach(v -> System.out.println("-- " + v));
                });

    }
}
