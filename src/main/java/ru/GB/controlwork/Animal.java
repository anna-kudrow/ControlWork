package ru.GB.controlwork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
//    public static Scanner in;
    Scanner sc = new Scanner(System.in);


    public void educate(Animal animal) {
        String newCommand;
        System.out.println("What the command does it know now?: ");
        newCommand = sc.toString();
        animal.commands +=  ", " + newCommand;
    }
    public void showSkills(){
        System.out.println("The animal have these skills: " + commands);
    }


    public static void addNewAnimal(ArrayList<Animal> animals) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input type of animal: ");
        String type = "";
        type = sc.nextLine();
//        Scanner sc = new Scanner(in);
        String name = "";
//        String bday = "";
        String commands = "";
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter bday: ");
        String input = sc.nextLine();
        DateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date bday = formatter.parse(input);
        System.out.println("Enter commands: ");
        commands = sc.nextLine();
        if (type.equalsIgnoreCase("cat, dog, hamster")) {
            Pet pet = new Pet(name, bday, commands);
            animals.add(pet);
        }
        if (type.equalsIgnoreCase("horse, camel, donkey")) {
            PackAnimal packAnimal = new PackAnimal(name, bday, commands);
            animals.add(packAnimal);
        }

    }}


