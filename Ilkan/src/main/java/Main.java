
import enums.Education;
import models.Assistant;
import models.Faculty;
import services.ReadFromFile;
import services.impl.ReadFromFileImpl;

import java.util.List;



public class Main {
    public static void main(String[] args) {

        ReadFromFile reader = new ReadFromFileImpl();

        //Изпълнение на клас ||| {
        //5.Създаване на факултет и викане на метода който чете от файла (тества също ||.1 , защото създава и асистенти прi направата на факултета)
        Faculty faculty = new Faculty();
        faculty.readFromTheFile(reader, "assistants1.json");

        System.out.println("|||.5");
        System.out.println("Прочетено и запазено от файла");


        //2.Стрингова интерпретация (тества също ||.2 , защото "toString" на Faculty вика и "toString" на Assistant)
        System.out.println();
        System.out.println("|||.2");
        System.out.println("Стрингова интерпретация на факултета");
        System.out.println(faculty);


        //3. Получаване на броя на асистентите които не са доктори или доктори на науката (тества също ||.4 , защото проверява дали асистента има даденото звание)
        System.out.println();
        System.out.println("|||.3");
        System.out.println("Броят на асистентите които не са доктори или доктори на науката е " + faculty.getNonDoctorsCount());


        //4 Вземане всички жени от факултета които имат подаващото се звание (за теста подавам звание "Doctor оf science")
        System.out.println();
        System.out.println("|||.4");
        System.out.println("Жените със звание 'Doctor оf science' са " + faculty.getAllWomenByEducation(Education.DOCTOR_ОF_SCIENCE));


        //6 Сравняване на два факултета по брой асистенти с звание доктор или доктор на науката (създава се нов факултет "facultyTwo")
        Faculty facultyTwo = new Faculty();
        facultyTwo.readFromTheFile(reader, "assistants2.json");

        System.out.println();
        System.out.println("|||.6");
        System.out.println("Факултетът с повече доктори и доктори на науката е: ");
        System.out.println(faculty.compareTo(facultyTwo) > 0 ? facultyTwo : faculty);


        //7 Вземане на всички асистенти по низходящ ред на брой звания (тества също ||.3 първата изборна точка за сравнение , защото създава TreeSet който използва compareTo на "Assistant")
        System.out.println();
        System.out.println("|||.7");
        System.out.println("Сортираният по низходящ ред на брой звания списък е " + faculty.getSortedByEducationCount());


        //1.Прочитане и промяна на асистентите в факултет(принтират се асистентите от "factory1.json",след това с помоща на "setAssistants" метода се променят на тези от "factory2.json" и се принтират новозапазенте)
        System.out.println();
        System.out.println("|||.1");
        System.out.println("Четене без промяна:");
        System.out.println(faculty.getAssistants());

        System.out.println("Нов запис");
        faculty.setAssistants(facultyTwo.getAssistants());

        System.out.println("Четене след новия запис:");
        System.out.println(faculty.getAssistants());
        // }

        System.out.println();
        System.out.println("BONUS");

        //Изборната точка за еквивалентност на асистентите
        List<Assistant> assistantsList = faculty.getAssistants().stream().toList();
        System.out.println();
        System.out.println("В случая подавам 2 различни и трябва да излезе false за разлика между тях");
        System.out.println(assistantsList.get(0).isEqualTo(assistantsList.get(1)));

        System.out.println("В случая подавам 2 еднакви и трябва да излезе true за еквивалентност между тях");
        System.out.println(assistantsList.get(0).isEqualTo(assistantsList.get(0)));

    }

}

