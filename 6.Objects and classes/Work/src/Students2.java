import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> listOfStudents = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] studentInfo = command.split("\\s+");
            Students student = new Students(studentInfo[0], studentInfo[1], Integer.parseInt(studentInfo[2]), studentInfo[3]);
            int index = -1;
            for (int i = 0; i < listOfStudents.size(); i++) {
                if (listOfStudents.get(i).firstName.equals(studentInfo[0]) && listOfStudents.get(i).lastName.equals(studentInfo[1])) {
                    index = i;
                }
            }
            if (index != -1) {
                listOfStudents.set(index, student);
            } else {
                listOfStudents.add(student);
            }

            command = scanner.nextLine();
        }
        String wantedTown = scanner.nextLine();
        for (Students student : listOfStudents
        ) {
            if (wantedTown.equals(student.town)) {
                System.out.printf("%s %s is %d years old", student.firstName, student.lastName, student.age);
                System.out.println();
            }


        }

    }

    static class Students {
        String firstName;
        String lastName;
        int age;
        String town;

        Students(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }
}
