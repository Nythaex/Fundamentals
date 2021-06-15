import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" "))
                .map(a->Integer.parseInt(a))
                .sorted((a1,a2)->a2.compareTo(a1))
                .limit(3)
                .forEach(a-> System.out.print(a+" "));

    }
}
