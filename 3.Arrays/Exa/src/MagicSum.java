import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());
        String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i <= array.length - 1; i++) {
            for (int a = i + 1; a <= array.length - 1; a++) {
                if (arrayInt[i]+arrayInt[a]==num) {
                    System.out.println(arrayInt[i]+" "+arrayInt[a]);

                }
            }

        }
    }

}

