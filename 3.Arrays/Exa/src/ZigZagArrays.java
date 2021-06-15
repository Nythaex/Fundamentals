import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        String[] first = new String[times];
        String[] second = new String[times];
        int higher = 1;
        for (int i = 0; i < times; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            if (higher % 2 == 0) {
                second[i] = array[0];
                first[i] = array[1];
            } else {
                first[i] = array[0];
                second[i] = array[1];
            }
            higher++;
        }

        String firstPrint = String.join(" ", first);
        String secondPrint = String.join(" ", second);


        System.out.println(firstPrint);
        System.out.println(secondPrint);
    }
}
