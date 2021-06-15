import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());
        List<Person> people=new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] splited=scanner.nextLine().split("\\s+");
            String name=splited[0];
            int age=Integer.parseInt(splited[1]);
          Person  addPerson=new Person(name,age);
            people.add(addPerson);

        }
        people.stream()
                .filter(p1 -> p1.age>30)
                .sorted((p1, p2) ->p1.getName().compareTo(p2.getName()) )
                .forEach(p1 -> System.out.printf("%s - %d%n",p1.getName(),p1.getAge()));

    }
    static class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
