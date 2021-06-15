import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[]strSplited=str.split("\\s+");
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <strSplited.length; i++) {
            numbers.add(Integer.parseInt(strSplited[i]));
        }
        String command=scanner.nextLine();
        while (!(command.equals("End"))){
            String[] commandSplited=command.split("\\s+");
            if (commandSplited[0].equals("Add")){
                numbers.add(Integer.parseInt(commandSplited[1]));
            }
            else if (commandSplited[0].equals("Insert")){
                if (Integer.parseInt(commandSplited[2])<0||Integer.parseInt(commandSplited[2])>=numbers.size()){
                    System.out.println("Invalid index");

                }
                else {
                    numbers.add(Integer.parseInt(commandSplited[2]), Integer.parseInt(commandSplited[1]));
                }
            }
            else if (commandSplited[0].equals("Remove")){
                if (Integer.parseInt(commandSplited[1])<0||Integer.parseInt(commandSplited[1])>=numbers.size()){
                    System.out.println("Invalid index");
                }
                else {
                    numbers.remove(Integer.parseInt(commandSplited[1]));}
            }
            else if (commandSplited[0].equals("Shift")){
                if (Integer.parseInt(commandSplited[2])<0||Integer.parseInt(commandSplited[2])>=numbers.size()){
                    System.out.println("Invalid index");

                }
                else {
                    if (commandSplited[1].equals("left")){
                        for (int i = 0; i <Integer.parseInt(commandSplited[2]); i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    }
                    else if (commandSplited[1].equals("right")){
                        for (int i = 0; i <Integer.parseInt(commandSplited[2]); i++) {
                            numbers.add(0,numbers.get(numbers.size()-1));
                            numbers.remove(numbers.size()-1);
                        }
                    }
                }

            }
            command=scanner.nextLine();
        }
        for (int num:numbers
        ) {
            System.out.print(num+" ");

        }

    }
}
