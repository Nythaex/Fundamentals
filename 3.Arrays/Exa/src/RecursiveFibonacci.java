import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        recurse(num,1,1,3);

    }

    private static void recurse(int num,int first,int second,int count) {
        int i=count;
        int sum=first+second;
        if (num==1||num==2){
            System.out.println(1);
            return;
        }
        if(i==num) {
            i--;
            System.out.println(sum);
            return;

        }
        if (i<num){
            i++;
         first=second;
         second=sum;
         recurse(num,first,second,i);
        }

    }

}
