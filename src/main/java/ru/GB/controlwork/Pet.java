package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Pet extends Animal{
    public Pet(String type, String name, LocalDate birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }
}
