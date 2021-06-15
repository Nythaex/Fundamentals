import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int atended = 0;
        for (int i = 1; i <= studentsCount; i++) {
           double at = Double.parseDouble(scanner.nextLine());
            double total = at / lecturesCount * (5 + bonus);
            if (Math.ceil(total)>=max){
                atended= (int) Math.ceil(at);
                max= (int) Math.ceil(total);
            }
        }
        System.out.printf("Max Bonus: %d.%n",max);
        System.out.printf("The student has attended %d lectures.",atended);

    }
}
