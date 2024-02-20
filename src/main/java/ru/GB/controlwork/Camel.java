package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Camel extends PackAnimal implements Skills{

    public Camel(String name, Date birthday, String commands) {
        super(name, birthday, commands);
    }
}
