import java.util.Collections;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String reversed = "";



        for (int i = 1; i < 4; i++) {
            reversed="";
          String  password = scanner.nextLine();
            for (int j = password.length()-1; j >= 0; j--) {
                char a = password.charAt(j);
                reversed += a;
            }

            if (user.equals(reversed)) {
                System.out.printf("User %s logged in.", user);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        System.out.printf("User %s blocked!", user);
    }
}
