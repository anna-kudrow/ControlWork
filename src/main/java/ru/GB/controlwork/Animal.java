package ru.GB.controlwork;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public abstract class Animal {
    protected String type;
    protected String name;
    protected Date birthday;
    protected String commands;

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

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }


    public String getType() {
        return type;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, String name, Date birthday, String commands) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
    public static Scanner in;


    public static void educate(Animal animal) {
        String newCommand;
        System.out.println("What the command does it know now?: ");
        newCommand = in.toString();
        animal.commands +=  ", " + newCommand;
    }
    public String showSkills(Animal animal){
        return String.valueOf("The animal have these skills: " + animal.commands);
    }


    public static void addNewAnimal() {
//        Scanner sc = new Scanner(in);
        String name = "", type = "";
        String bday = "";
        String commands = "";

        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter type: ");
        type = in.nextLine();
        System.out.println("Enter bday: ");
        bday = in.next();
        System.out.println("Enter commands: ");
        commands = in.nextLine();

//        in.nextLine();
//        System.out.println("Enter color: ");
//        color = in.nextLine();
//        dogs[i] = new Dog(breed, size, age, color, "Dog");
//    }
//
//}
//    }

