package ru.GB.controlwork;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static java.lang.System.in;

public abstract class Animal {
    protected String type;
    protected String name;
    protected Date birthday;
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

    public Date getBirthday() {
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

    public Animal(String type, String name, Date birthday, List<String> commands) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }


    public static void educate(Animal animal) {
        String newCommand;
        System.out.println("What the command does it know now?: ");
        newCommand = in.toString();
        animal.commands.add(newCommand);
    }
    public String showSkills(){
        return String.valueOf("The animal have these skills: " + commands);
    }


//    public static void add

}