package services.impl;

import com.google.gson.Gson;
import models.Assistant;
import models.Faculty;
import services.ReadFromFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFromFileImpl implements ReadFromFile {
    @Override
    public Set< Assistant> readFromFile(String fileName) {
        Gson gson = new Gson();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/main/resources/"+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileReader != null;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();
        return gson.fromJson(lines.collect(Collectors.joining("")), Faculty.class).getAssistants();

    }
}
