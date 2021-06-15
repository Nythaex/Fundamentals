import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        String kidInfo = scanner.nextLine();
        Pattern regex=Pattern.compile("@(?<name>[A-Za-z]+)[^-@!:>]*!(?<type>[GN])!");
        while (!kidInfo.equals("end")) {
            StringBuilder theKid = new StringBuilder();
            for (int i = 0; i < kidInfo.length(); i++) {
                char chary= (char) (kidInfo.charAt(i)-key);
                theKid.append(chary);
            }
            Matcher matcher=regex.matcher(String.valueOf(theKid));
            if (matcher.find()){
                if (matcher.group("type").equals("G")){
                    System.out.println(matcher.group("name"));
                }
            }


            kidInfo = scanner.nextLine();
        }


    }
}
