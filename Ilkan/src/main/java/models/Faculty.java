package models;

import com.google.gson.Gson;
import enums.Education;
import enums.Gender;
import services.ReadFromFile;
import services.impl.ReadFromFileImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Faculty implements Comparable<Faculty>{

    // ||| Частни полета
    private Set<Assistant> assistants;


    // ||| Контструктори {
    //Пълен конструктор
    public Faculty(Set<Assistant> assistants) {
        this.assistants = assistants;
    }
    //Празен конструктор
    public Faculty() {
        assistants=new HashSet<>();
    }
    // }

    // |||.1 Гетъри и сетъри (четене и запис на членовете)
    public Set<Assistant> getAssistants() {
        return assistants;
    }
    public Faculty setAssistants(Set<Assistant> assistants) {
        this.assistants = assistants;
        return this;
    }

    // |||.2 Стрингова интерпретация
    @Override
    public String toString() {
        return
                "Assistants:\n" +  assistants.stream().map(Assistant::toString).collect(Collectors.joining("\n"));
    }

    // |||.3 Вземи всички от факултета които не са доктори или доктори на науката
    public int getNonDoctorsCount(){
     int count=0;
        for (Assistant assistant:this.assistants
             ) {
            if (!(assistant.contain(Education.DOCTOR)|| assistant.contain(Education.DOCTOR_ОF_SCIENCE))) {
                count++;
            }
        }
        return count;
    }

    // |||.4 Вземи всички жени от факултета които имат подаващото се звание
    public Set<Assistant> getAllWomenByEducation(Education education){
        Set<Assistant> byEducation=new HashSet<>();
        for (Assistant assistant:this.assistants
        ) {
            if (assistant.contain(education)&& assistant.getGender()== Gender.Woman) {
               byEducation.add(assistant);
            }
        }
        return byEducation;
    }

    // |||.5 Прочитане и записване от файла асистенти в папката с ресурси
    public void readFromTheFile(ReadFromFile reader,String fileName){
        this.assistants=reader.readFromFile(fileName);
    }

    // |||.6 Ползва се за сравняване с друг факултет по по-голям брой асистенти със звание доктор или доктор на науката
    @Override
    public int compareTo(Faculty o) {
        return (o.getAssistants().size()-o.getNonDoctorsCount())-(this.getAssistants().size()-this.getNonDoctorsCount());
    }


    // |||.7 За сортиране по звания в намаляваш ред
    public Set<Assistant> getSortedByEducationCount(){

        TreeSet<Assistant> assistantsResult = new TreeSet<Assistant>(this.assistants);

        return assistantsResult;

    }





}
