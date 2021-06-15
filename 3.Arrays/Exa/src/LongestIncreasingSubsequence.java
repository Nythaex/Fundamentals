import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> biggest = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        String str = scanner.nextLine();
        String[] arrayStr = str.split(" ");
        int [] nums=new int[arrayStr.length];
        for (int i = 0; i <= arrayStr.length - 1; i++) {
            nums[i]=Integer.parseInt(arrayStr[i]);
        }
        int biggerNum;

        for (int i = 0; i <= arrayStr.length - 1; i++) {
            biggerNum=nums[i];
            prev.add(biggerNum);
            for (int a = i+1; a <= arrayStr.length - 1; a++) {
                if (nums[a]>biggerNum){
                    biggerNum=nums[a];
                    prev.add(biggerNum);
                }
            }
            if (prev.size()>biggest.size()){
                biggest.removeAll(biggest);
                for (int n:prev
                     ) {
                    biggest.add(n);
                }
            }
            prev.removeAll(prev);
        }

        for (int n:biggest
             ) {
            System.out.println(n+" ");
        }
    }

}
