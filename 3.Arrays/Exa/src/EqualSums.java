import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int[] arrayInt = new int[strArray.length];
        if (arrayInt.length==1){
            System.out.println(0);
            return;
        }
        int bestIndex = 0;
        for (int i = 0; i <= strArray.length - 1; i++) {
            arrayInt[i] = Integer.parseInt(strArray[i]);

        }
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            int leftsum = 0;
            int rightsum = 0;
            for (int a = 0; a<= arrayInt.length - 1; a++) {
              if(a<i){
                  leftsum+=arrayInt[a];
              }
              else if (a>i){
                  rightsum+=arrayInt[a];
              }

            }
            if (leftsum==rightsum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}



