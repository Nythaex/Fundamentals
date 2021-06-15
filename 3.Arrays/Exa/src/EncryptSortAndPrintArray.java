import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int namesCount=Integer.parseInt(scanner.nextLine());
        List<Integer> sum=new ArrayList<>();
        for (int i = 0; i <namesCount; i++) {
            String name=scanner.nextLine();
            int sumi=0;
            for (int a = 0; a <= name.length() - 1; a++) {
                char chary=name.charAt(a);
                if (chary=='a'||chary=='e'||chary=='i'||chary=='o'||chary=='u'||chary=='A'||chary=='E'||chary=='I'||chary=='O'||chary=='U'){
                    sumi+=chary*name.length();
                }
                else {
                    sumi+=Math.floor(chary/name.length());
                }
            }
            sum.add(sumi);
        }
        Collections.sort(sum);
        for (int num:sum) {
            System.out.println(num+" ");
        }

    }
}
