import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if (str.length()%2==0){
            System.out.print(str.charAt((str.length()-1)/2));
            System.out.print(str.charAt(((str.length()-1)/2)+1));
        }
        else {
            System.out.print(str.charAt((str.length()-1)/2));
        }

    }
}
