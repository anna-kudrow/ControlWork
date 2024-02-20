package ru.GB.controlwork;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public abstract class Animal {

    private static int counter;
    protected String name;
    protected Date birthday;
    protected String commands;
    public static int getCounter(){
        return counter;
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


    public Animal(String name, Date birthday, String commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
    public static Scanner in;


    public void educate(Animal animal) {
        String newCommand;
        System.out.println("What the command does it know now?: ");
        newCommand = in.toString();
        animal.commands +=  ", " + newCommand;
    }
    public void showSkills(){
        System.out.println("The animal have these skills: " + commands);
    }


    public static void addNewAnimal() {
//        Scanner sc = new Scanner(in);
        String name = "", type = "";
        String bday = "";
        String commands = "";

        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter bday: ");
        bday = in.next();
        System.out.println("Enter commands: ");
        commands = in.nextLine();
    }}

