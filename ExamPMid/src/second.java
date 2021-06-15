import java.util.*;
import java.util.stream.Collectors;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String comand = scanner.nextLine();


        while (!comand.equals("end")) {
            String[] splited = comand.split("\\s++");
            if (splited[0].equals("reverse")) {
                int start = Integer.parseInt(splited[2]);
                int last = Integer.parseInt(splited[4]) - 1 + start;
                for (int i = 0; i <= Integer.parseInt(splited[4]) / 2; i++) {
                    int cont = Integer.parseInt(numbers.get(start));
                    numbers.set(start, numbers.get(last));
                    numbers.set(last, String.valueOf(cont));
                    last--;
                    start++;
                }
            } else if (splited[0].equals("sort")) {
                int start = Integer.parseInt(splited[2]);
                int last = Integer.parseInt(splited[4]) ;
                List<String> secondList=new ArrayList<>();
                for (int i = 1; i <= Integer.parseInt(splited[4]); i++) {
                    secondList.add(numbers.get(start));
                    start++;
                }
                Collections.sort(secondList);
                start = Integer.parseInt(splited[2]);
                for (int i = 0; i <Integer.parseInt(splited[4]); i++) {
                    numbers.set(start,secondList.get(i));
                    start++;
                }

            } else if (splited[0].equals("remove")) {
                for (int i = 0; i < Integer.parseInt(splited[1]); i++) {
                    numbers.remove(0);
                }
            }
            comand = scanner.nextLine();
        }

        String printed=String.join(", ",numbers);
        System.out.println(printed);

    }
}
