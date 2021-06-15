import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Type=scanner.nextLine();
        if (Type.equals("int")){
            int first=Integer.parseInt(scanner.nextLine());
            int second=Integer.parseInt(scanner.nextLine());
            GetMax(first,second);
        }
        else if (Type.equals("char")){
            char first=scanner.nextLine().charAt(0);
            char second=scanner.nextLine().charAt(0);
            GetMax(first,second);
        }
        else if (Type.equals("string")){
            String first=scanner.nextLine();
            String second=scanner.nextLine();
            GetMax(first,second);
        }
    }

    private static void GetMax(String first, String second) {
        if (first.compareTo(second)>=0){
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
    }

    private static void GetMax(int first, int second) {
        if (first>second){
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }

    }
    private static void GetMax(char first, char second) {
        if (first>second){
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
    }
}
