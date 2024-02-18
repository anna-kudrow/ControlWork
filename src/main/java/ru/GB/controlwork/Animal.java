package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    protected String type;
    protected String name;
    protected LocalDate birthday;
    protected List<String> commands;

    public static int counter;
    public static int idCounter;
    public int id;
    {
        counter++;
        id = ++idCounter;
    }
    static {
        idCounter = 0;
    }



    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = List.of(commands);
    }

    public String getType() {
        return type;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, String name, LocalDate birthday, List<String> commands) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }


    public String showSkills(){
        return String.valueOf("The animal have these skills: " + commands);
    }

}