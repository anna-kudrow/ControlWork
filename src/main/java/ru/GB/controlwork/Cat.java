package ru.GB.controlwork;

import java.util.Date;
import java.util.List;

public class Cat extends Pet implements Skills{

    public Cat(String name, Date birthday, String commands) {
        super(name, birthday, commands);
    }
}
