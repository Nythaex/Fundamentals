import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());
        Pattern name=Pattern.compile("@(?<name>[A-Z]?[a-z]+)\\|");
        Pattern age=Pattern.compile("#(?<age>\\d+)+\\*");
        for (int i = 0; i < count; i++) {
            boolean checkName=false;
            boolean checkAge=false;
            String text=scanner.nextLine();
            Matcher matcher=name.matcher(text);
            String Name="";
            String Age="";
            if (matcher.find()){
                checkName=true;
                 Name=matcher.group("name");
            }else {
                checkName=false;

            }
            matcher=age.matcher(text);
            if (matcher.find()){
                checkAge=true;
                Age=matcher.group("age");
            }else {
                checkAge=false;
            }
            if ((checkAge == true && checkName) == true){
                System.out.printf("%s is %s years old.%n",Name,Age);
            }
        }


    }
}
