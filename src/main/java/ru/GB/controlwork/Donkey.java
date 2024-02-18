package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.List;

public class Donkey extends PackAnimal{
    public Donkey(String type, String name, LocalDate birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }
}
