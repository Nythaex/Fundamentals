import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder field=new StringBuilder(scanner.nextLine());
        int explosionPower=0;
        for (int i = 0; i <= field.length()-1; i++) {
            if (field.charAt(i)=='>'){
                explosionPower+=Integer.parseInt(String.valueOf(field.charAt(i+1)));
            }
            else {
                if (explosionPower>0){
                    field.deleteCharAt(i);
                    explosionPower-=1;
                    i--;
                }
            }
        }
        System.out.println(field);
    }
}
