import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);
        printChars(first,second);


    }

    private static void printChars(char first, char second) {
        if (first>second){
            for (char i = (char) (second+1); i<first; i++) {
                System.out.print(i+" ");
            }
        }
        else {
            for (char i = (char) (first+1); i<second; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
