import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        isPasswordCorect(str);

    }

    private static void isPasswordCorect(String str) {
        int digits = 0;
        boolean isCorect = true;
        boolean iseverythinCorect=true;
        if (str.length() > 10 || str.length() < 6) {
            System.out.println("Password must be between 6 and 10 characters");
            iseverythinCorect=false;
        }
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i)))) {
                isCorect = false;

            }
            if (Character.isDigit(str.charAt(i))) {
                digits++;
            }

        }
        if (isCorect==false) {
            System.out.println("Password must consist only of letters and digits");
            iseverythinCorect=false;

        }
        if (digits<=2){
            System.out.println("Password must have at least 2 digits");
            iseverythinCorect=false;
        }
        if (iseverythinCorect){
            System.out.println("Password is valid");
        }
    }
}
