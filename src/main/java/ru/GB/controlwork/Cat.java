package ru.GB.controlwork;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    public Cat(String type, String name, Date birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }
}
