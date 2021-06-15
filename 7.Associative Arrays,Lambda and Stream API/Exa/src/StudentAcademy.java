import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> students = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            Double studentGrade = Double.parseDouble(scanner.nextLine());
            List<Double> studentInfo = students.get(studentName);
            if (studentInfo == null) {
                studentInfo = new LinkedList<>();
                students.put(studentName, studentInfo);
            }
            studentInfo.add(studentGrade);

        }
        students.entrySet()
                .stream()
                .sorted((a, b) -> {
                    double first = a.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    double second = b.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(a -> {
                    double who = a.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    if (who>=4.50){
                        System.out.printf("%s -> %.2f%n",a.getKey(),who);
                    }
                });

    }
}
