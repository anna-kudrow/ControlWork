package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class PackAnimal extends Animal{

    public PackAnimal(String type, String name) {
        super(type, name);
    }

    public PackAnimal(String type, String name, LocalDate birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }
}