import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = findmain(scanner.nextLine());

        StringBuilder sum = new StringBuilder();
        int add = 0;
        int second = Integer.parseInt(scanner.nextLine());
        if (second==0||first.equals("0")){
            System.out.println(0);
            return;
        }
        for (int i = first.length() - 1; i >= 0; i--) {
            int s = Integer.parseInt(String.valueOf(first.charAt(i)));
            String suming = String.valueOf((s * second) + add);
            if (suming.length() > 1) {
                int last=Integer.parseInt(suming)%10;
                sum.append(last);
                add = Integer.parseInt(suming)/10;
            }
            else {
                int last=Integer.parseInt(suming)%10;
                sum.append(last);
                add=0;
            }

        }
        if (add!=0) {
            sum.append(add);
        }
        sum.reverse();
        String score=String.valueOf(sum);
        System.out.println(score);

    }

    private static String findmain(String nextLine) {
        for (int i = 0; i <= nextLine.length() - 1; i++) {
            if (nextLine.charAt(i)!='0'){
                return nextLine.substring(i);
            }
        }
      return "0";
    }
}
