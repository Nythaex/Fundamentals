import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] courses = scanner.nextLine().split(", ");
        List<String> theList = new ArrayList<>();
        for (int i = 0; i <= courses.length - 1; i++) {
            theList.add(courses[i]);
        }
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            String lesson = tokens[1];
            switch (tokens[0]) {
                case "Add":if (!theList.contains(lesson)) {
                    theList.add(lesson);
                }break;
                case "Insert":
                    if (!theList.contains(lesson)&&Integer.parseInt(tokens[2])>=0&&Integer.parseInt(tokens[2])<theList.size()) {
                        theList.add(Integer.parseInt(tokens[2]), lesson);
                    }
                    break;
                case "Remove":
                    if (theList.contains(lesson)) {
                        theList.remove(lesson);
                        if (theList.contains(String.format("%s-Exercise",lesson))){
                            theList.remove(String.format("%s-Exercise",lesson));
                        }
                    }
                    break;
                case "Swap":
                    String secondLesson=tokens[2];
                    if (theList.contains(lesson)&&theList.contains(secondLesson)){
                        Collections.swap(theList,theList.indexOf(lesson),theList.indexOf(secondLesson));
                        if (theList.contains(String.format("%s-Exercise",lesson))){
                            theList.remove(String.format("%s-Exercise",lesson));
                            int index=theList.indexOf(lesson);
                            theList.add(index,String.format("%s-Exercise",lesson));
                        }if (theList.contains(String.format("%s-Exercise",secondLesson))){
                            theList.remove(String.format("%s-Exercise",secondLesson));
                            int index=theList.indexOf(secondLesson);
                            theList.add(index+1,String.format("%s-Exercise",secondLesson));
                        }
                    }
                    break;
                case "Exercise":
                    if (!theList.contains(lesson)){
                        theList.add(lesson);
                    }
                    if (!theList.contains(String.format("%s-Exercise",lesson))){
                        int index=theList.indexOf(lesson);
                        theList.add(index+1,String.format("%s-Exercise",lesson));
                    }

                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= theList.size() - 1; i++) {
            System.out.print(i+1+".");
            System.out.println(theList.get(i));
        }

    }
}
