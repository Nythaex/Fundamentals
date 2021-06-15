import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String>fruits=Arrays.stream(scanner.nextLine().split(" "))
                .filter(f1->f1.length()%2==0)
                .collect(Collectors.toList());
        for (String f:fruits
             ) {
            System.out.println(f);
        }

    }
}
