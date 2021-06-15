import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new LinkedHashMap<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[1];
            if (tokens[0].equals("register")){
                String carNumber = tokens[2];
                if (!users.containsKey(name)){
                    users.put(name,carNumber);
                    System.out.printf("%s registered %s successfully%n",name,carNumber);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",users.get(name));
                }
            }else {
                if (!users.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else {
                    users.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }

        }
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

    }
}
