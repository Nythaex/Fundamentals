import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> materials=new LinkedHashMap<>();
        String comand=scanner.nextLine();
        while (!comand.equals("stop")){
            int theValue=Integer.parseInt(scanner.nextLine());
            Integer theLastValue=materials.get(comand);
            if (materials.containsKey(comand)){
                materials.put(comand,theLastValue+theValue);
            }else {
                materials.put(comand,theValue);
            }
            comand=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
