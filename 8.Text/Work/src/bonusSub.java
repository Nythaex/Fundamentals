import java.util.Scanner;

public class bonusSub {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String code=scanner.nextLine();
        String text=scanner.nextLine();
        while (text.contains(code)){
            int current=0;
            StringBuilder forChange= new StringBuilder();
            String subString="";
            int nextIndex=text.indexOf(code);
            while(nextIndex!=-1) {
                subString = text.substring(current,nextIndex);
                 forChange.append(subString);
                 current=nextIndex+code.length();
                 nextIndex=text.indexOf(code,current);

            }
            subString = text.substring(current);
            forChange.append(subString);
            text=forChange.toString();
        }
        System.out.println(text);

    }
}
