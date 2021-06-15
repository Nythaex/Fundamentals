import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> cores = new LinkedHashMap<>();
        String comand = scanner.nextLine();

        while (!comand.equals("end")) {
            String[] tokens = comand.split(" : ");
            String nameCores = tokens[0];
            String nameStudent = tokens[1];
            List<String> studentName = cores.get(nameCores);
            if (studentName == null) {
                studentName = new ArrayList<>();
                cores.put(nameCores, studentName);
            }
            studentName.add(nameStudent);
            comand = scanner.nextLine();
        }

        cores.entrySet()
                .stream()
                .sorted((a1, a2) -> Integer.compare(a2.getValue().size(),a1.getValue().size()))
                .forEach((a1)->{
                    System.out.println(a1.getKey()+": "+a1.getValue().size());
                    a1.getValue().stream()
                            .sorted()
                            .forEach(v-> System.out.println("-- "+v));
                });



    }
}
