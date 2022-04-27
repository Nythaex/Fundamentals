package models;

import enums.Education;
import enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import java.util.stream.Collectors;

public class Assistant implements  Comparable<Assistant>{

    // || Частни полета
    private String name;
    private Gender gender;
    private List<Education> educations;

    // || Контструктори {
    //Пълен конструктор
    public Assistant(String name, Gender gender, List<Education> educations) {
        this.name = name;
        this.gender = gender;
        this.educations = educations;
    }
     // }

    //Празен конструктор
    public Assistant() {
        educations=new ArrayList<>();
    }

    // ||.1 Гетъри и сетъри (четене и запис на полетата)
    public String getName() {
        return name;
    }
    public Assistant setName(String name) {
        this.name = name;
        return this;
    }
    public Gender getGender() {
        return gender;
    }
    public Assistant setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
    public List<Education> getEducations() {
        return educations;
    }
    public Assistant setEducations(List<Education> educations) {
        this.educations = educations;
        return this;
    }


    // ||.2 Стрингова интерпретация
    @Override
    public String toString() {
        return
                "Name=" + name  +
                ", Gender=" + gender +
                ", Educations=[" + educations.stream().map(education -> {
                    String educationName=education.toString().toLowerCase(Locale.ROOT);
                   return educationName.substring(0, 1).toUpperCase() + educationName.substring(1).replace('_',' ');

                }).collect(Collectors.joining(", "))+"]"
                ;
    }


    // ||.3 Сравнители {
    //Сравнява асистентите по брой образования (Comparable-първата точка по избор)
    @Override
    public int compareTo(Assistant o) {
        return o.getEducations().size()-this.getEducations().size()==0?-1:o.getEducations().size()-this.getEducations().size();
    }

    //Проверява дали асистентите са еквивалентни (втората точка по избор) {
    public boolean isEqualTo(Assistant o) {
       if ((!this.name.equals(o.name))||this.gender!=o.gender||(!equalEducations(this.educations,o.educations))){
           return false;
       }
       return true;
    }
    // Частна проверка за "isEqualTo" дали двата списъка от образования са еднакви
    private boolean equalEducations(List first,List second){

        if (first.size()==second.size()){
            for (int i = 0; i < first.size(); i++) {
                if (first.get(i)!=second.get(i)){
                    return false;
                }
            }
            return true;
        }
            return false;

    }
    //}


    // ||.4 Проверка дали асистента има подаденото звание
    public boolean contain(Education education){
        return educations.contains(education);
    }
}
