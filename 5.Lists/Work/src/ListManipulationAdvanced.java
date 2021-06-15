import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        for (int i = 0; strArray.length - 1 >= i; i++) {
            numbers.add(Integer.parseInt(strArray[i]));
        }

        String command = scanner.nextLine();
        while (!(command.equals("end"))) {
            String[] commandSplited = command.split(" ");
            if (commandSplited[0].equals("Contains")) {
                if (numbers.contains(Integer.parseInt(commandSplited[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (commandSplited[0].equals("Print")) {
                if (commandSplited[1].equals("even")) {
                    for (int numbs : numbers) {
                        if (numbs % 2 == 0)
                            System.out.print(numbs + " ");
                    }
                    System.out.println();
                } else if (commandSplited[1].equals("odd")) {
                    for (int numbs : numbers) {
                        if (numbs % 2 != 0)
                            System.out.print(numbs + " ");
                    }
                    System.out.println();
                }
            } else if (commandSplited[1].equals("sum")) {
                int sum=0;
                for (int numbs : numbers) {
                   sum+=numbs;
                }
                System.out.println(sum);

            } else if (commandSplited[0].equals("Filter")) {
                for (int numb : numbers) {
                    switch (commandSplited[1]) {
                        case "<":
                            if (numb < Integer.parseInt(commandSplited[2])) {
                                System.out.print(numb + " ");

                            }
                            break;
                        case "<=":
                            if (numb <= Integer.parseInt(commandSplited[2])) {
                                System.out.print(numb + " ");

                            }
                            break;
                        case ">":
                            if (numb > Integer.parseInt(commandSplited[2])) {
                                System.out.print(numb + " ");
                            }
                            break;

                        case ">=":
                            if (numb >= Integer.parseInt(commandSplited[2])) {
                                System.out.print(numb + " ");
                            }
                            break;
                    }
                }
                System.out.println();
            }


            command = scanner.nextLine();
        }
    }
}
