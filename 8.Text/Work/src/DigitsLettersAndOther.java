import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder alp = new StringBuilder();
        StringBuilder dig = new StringBuilder();
        StringBuilder other = new StringBuilder();
        String[] text = scanner.nextLine().split("");
        char[] a=scanner.nextLine().toCharArray();
        for (int i = 0; i <= text.length - 1; i++) {

            if (Character.isDigit(a[i])) {
                alp.append(a[i]);
            } else if (Character.isAlphabetic(a[i])) {
                dig.append(a[i]);
            } else {
                other.append(a[i]);
            }
        }
        System.out.println(alp.toString());
        System.out.println(dig.toString());
        System.out.println(other.toString());
    }
}
