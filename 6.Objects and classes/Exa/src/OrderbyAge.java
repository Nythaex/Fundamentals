import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderbyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("End")){
        String[] info = command.split("\\s+");
        Person dude = new Person(info[0], info[1], Integer.parseInt(info[2]));
        persons.add(dude);
        command = scanner.nextLine();
        }
        persons.stream()
                .sorted((p1,p2)->Integer.compare(p1.age,p2.age))
                .forEach((p1)-> System.out.printf("%s with ID: %s is %d years old.%n",p1.name,p1.ID,p1.age));


    }

    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

    }
}
