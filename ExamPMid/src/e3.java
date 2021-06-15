import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = scanner.nextLine().split(" ");
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i <= products.length - 1; i++) {
            numbers.add(products[i]);
        }
        int turns = 0;
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            turns++;
            String[] splited = command.split(" ");
            if (splited[0].equals(splited[1]) || Integer.parseInt(splited[0]) < 0 || Integer.parseInt(splited[0])
                    > numbers.size() - 1 || Integer.parseInt(splited[1]) < 0 || Integer.parseInt(splited[1]) > numbers.size() - 1) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String chary="-"+turns+"a";
                numbers.add(numbers.size()/2,chary);
                numbers.add(numbers.size()/2,chary);
            }else {
                if (numbers.get(Integer.parseInt(splited[0])).equals(numbers.get(Integer.parseInt(splited[1])))){
                    System.out.printf("Congrats! You have found matching elements - %s!%n",numbers.get(Integer.parseInt(splited[0])));
                    if (Integer.parseInt(splited[0])>Integer.parseInt(splited[1])){
                        numbers.remove(Integer.parseInt(splited[0]));
                        numbers.remove(Integer.parseInt(splited[1]));
                    }else {
                        numbers.remove(Integer.parseInt(splited[1]));
                        numbers.remove(Integer.parseInt(splited[0]));
                    }

                }
                else {
                    System.out.println("Try again!");
                }
            }

            if (numbers.size()  == 0) {
                System.out.printf("You have won in %d turns!", turns);
                return;
            }
            command = scanner.nextLine();
        }


        System.out.println("Sorry you lose :(");
        for (String n : numbers
        ) {
            System.out.print(n + " ");
        }

    }//////////////01:21:00
}
