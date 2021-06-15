import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String code=scanner.nextLine();
        String text=scanner.nextLine();

        while (text.contains(code)){
            text=text.replace(code,"");
        }
        System.out.println(text);
    }
}
