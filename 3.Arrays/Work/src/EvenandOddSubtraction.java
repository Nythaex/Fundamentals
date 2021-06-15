import java.util.Scanner;

public class EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ArrayAtString = scanner.nextLine();
        String[] ArrayString = ArrayAtString.split(" ");
        int theSum=0;
        int the=0;
        int[] arrayInt = new int[ArrayString.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(ArrayString[i]);
            if(arrayInt[i]%2==0){
                theSum+=arrayInt[i];
            }
            else {
                the+=arrayInt[i];
            }
        }
        System.out.println(theSum-the);

    }
}
