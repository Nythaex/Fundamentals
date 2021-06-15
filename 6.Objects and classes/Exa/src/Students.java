import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Studentz> students=new ArrayList<>();
        for (int i = 0; i <count; i++) {
            String[] splited=scanner.nextLine().split(" ");
            Studentz st=new Studentz(splited[0],splited[1],Double.parseDouble(splited[2]));
            students.add(st);
        }
        students.stream()
                .sorted((s1,s2)->Double.compare(s2.grade,s1.grade))
        .forEach((s1)-> System.out.printf("%s %s: %.2f%n",s1.first,s1.second,s1.grade));



    }
    static class Studentz{
        String first;
        String second;
        double grade;

        Studentz(String first,String second,double grade){
            this.first=first;
            this.second=second;
            this.grade=grade;
        }

        public String getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
    }
}
