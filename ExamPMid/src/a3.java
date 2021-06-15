import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splited = scanner.nextLine().split("\\s+");
        int[] numbs = new int[splited.length];
        for (int i = 0; i <= splited.length - 1; i++) {
            numbs[i] = Integer.parseInt(splited[i]);
        }
        Arrays.sort(numbs);
        int[] revers=reverse(numbs, numbs.length);

        boolean no = true;
        int sum = 0;
        for (int n : numbs
        ) {
            sum += n;
        }
        sum /= numbs.length;
        int i = 1;
        for (int n : revers
        ) {
            if (sum < n && i <= 5) {
                System.out.print(n + " ");
                no = false;
                i++;
            }
        }
        if (no) {
            System.out.println("No");
        }

    }

    static int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        int[] ba=new int[n];
        return b;
    }
}
