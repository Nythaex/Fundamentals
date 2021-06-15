import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern HealtReg = Pattern.compile("[^\\d-.+*/,]");
        Pattern Damage = Pattern.compile("[-+]?[\\d]+\\.*[\\d]*|[*/]");
        String[] names = scanner.nextLine().split(",+\\s*");
        Map<String, List<Double>> sorted = new TreeMap<>();
        for (int i = 0; i <= names.length - 1; i++) {
            names[i]=names[i].replaceAll(" ","");
            Matcher matcher = HealtReg.matcher(names[i]);
            int healt = 0;
            while (matcher.find()) {
                healt += matcher.group().charAt(0);
            }
            int more = 0;
            int low = 0;
            double damage = 0;
            matcher = Damage.matcher(names[i]);
            String action="";
            while (matcher.find()) {
                if (matcher.group().equals("*")) {
                    action+="*";
                } else if (matcher.group().equals("/")) {
                    action+="/";
                } else {
                    damage += Double.parseDouble(matcher.group());
                }
            }
            for (int a = 0; a <action.length(); a++) {
                char chary=action.charAt(a);
                if (chary=='*'){
                    damage*=2;
                }else if (chary=='/'){
                    damage/=2;
                }
            }
            List<Double> toBeSorted = sorted.get(names[i]);
            if (toBeSorted == null) {
                toBeSorted = new ArrayList<>();
                sorted.put(names[i], toBeSorted);
            }
            toBeSorted.add(Double.parseDouble(String.valueOf(healt)));
            toBeSorted.add(damage);
        }
        for (Map.Entry<String, List<Double>> entry : sorted.entrySet()) {
            System.out.printf("%s - %.0f health, %.2f damage",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
            System.out.println();
        }


    }
}
