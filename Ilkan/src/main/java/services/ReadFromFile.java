package services;

import models.Assistant;

import java.util.Set;

public interface ReadFromFile {
    Set<Assistant> readFromFile(String fileName);

}
