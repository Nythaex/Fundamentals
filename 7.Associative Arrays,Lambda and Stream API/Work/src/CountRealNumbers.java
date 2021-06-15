import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> coronaVirus = new TreeMap<>();
        String[] command = scanner.nextLine().split(" ");
        for (int i = 0; i <= command.length - 1; i++) {
            Integer count=coronaVirus.get(command[i]);
            if (count==null){
                count=0;
            }
            coronaVirus.put(command[i],count+=1);
        }
        for (Map.Entry<String, Integer> entry : coronaVirus.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }

    }
}
