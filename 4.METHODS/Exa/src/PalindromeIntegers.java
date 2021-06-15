import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!(str.equals("END"))) {
            boolean truee = isIt(str);
            System.out.println(truee);
            str = scanner.nextLine();
        }
    }

    private static boolean isIt(String num) {
        boolean truee = true;
        for (int i = 0; i <=( num.length() - 1)/2; i++) {
            if (num.charAt(i)!=num.charAt(num.length()-i-1)) {
                truee=false;
            }
        }
        return truee;
    }
}
