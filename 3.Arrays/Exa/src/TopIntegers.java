import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i <= array.length - 1; i++) {
            boolean bigger = true;
            for (int a = i + 1; a <= array.length - 1; a++) {
                if (arrayInt[i] <= arrayInt[a]) {
                  bigger=false;
                  break;
                }
            }
            if (bigger==true){
                System.out.print(arrayInt[i]+" ");
            }
        }
    }
}
