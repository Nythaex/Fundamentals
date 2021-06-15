import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int commandsCount=Integer.parseInt(scanner.nextLine());
        List<String> people=new ArrayList<>();
        for (int i = 0; i <commandsCount; i++) {
            String comand=scanner.nextLine();
            String[] splited=comand.split(" ");
            if (splited[2].equals("going!")){
                    if (people.contains(splited[0])){
                        System.out.printf("%s is already in the list!",splited[0]);
                        System.out.println();
                    }
                    else {
                        people.add(splited[0]);
                    }
            }
            else {
                if (people.contains(splited[0])){
                    people.remove(splited[0]);
                }
                else {
                    System.out.printf("%s is not in the list!",splited[0]);
                    System.out.println();
                }
            }

        }
        for (String person:
             people) {
            System.out.println(person);
        }
    }
}
