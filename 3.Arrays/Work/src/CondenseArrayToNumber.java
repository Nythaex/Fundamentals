import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] strArray=str.split(" ");
        int[] nums=new int[strArray.length];
        for (int i = 0; i <= strArray.length - 1; i++) {
          nums[i]=Integer.parseInt(strArray[i]);
        }
        while (nums.length>1){
            int[] sum=new int[nums.length-1];
            for (int i = 0; i <= nums.length - 2; i++) {
                sum[i]=nums[i]+nums[i+1];

            }
            nums=sum;
        }
        System.out.println(nums[0]);
    }
}
