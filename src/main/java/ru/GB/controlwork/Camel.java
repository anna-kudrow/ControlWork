package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.List;

public class Camel extends PackAnimal{


    public Camel(String type, String name, LocalDate birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }
}
