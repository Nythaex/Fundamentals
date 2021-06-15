import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bigSplit = scanner.nextLine().split("\\|");
        String finalResult = "";
        for (int i = bigSplit.length - 1; i >= 0; i--) {
            String[] smallSplit = bigSplit[i].split("\\s+");
            for (int g = 0; g <= smallSplit.length - 1; g++) {
                if(!smallSplit[g].equals("")&&!smallSplit.equals(" ")){
                    finalResult+=smallSplit[g]+" ";
                }
            }

        }
        System.out.println(finalResult);

    }
}
