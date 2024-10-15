package src.main;
import src.main.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Assignment 1: Adapter Pattern - Audio Player
        System.out.println("=== Assignment 1: Adapter Pattern - Audio Player ===");
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        player.play("wav", "song.wav");
        player.play("aac", "song.aac");
        System.out.println();

        // Assignment 2: Bridge Pattern - Remote Control System
        System.out.println("=== Assignment 2: Bridge Pattern - Remote Control System ===");
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();

        RemoteControl basicRemote = new BasicRemote(tv);
        RemoteControl advancedRemote = new AdvancedRemote(dvd);

        basicRemote.powerOn();
        basicRemote.setChannel(10);
        basicRemote.powerOff();

        advancedRemote.powerOn();
        advancedRemote.setVolume(30);
        advancedRemote.powerOff();
        System.out.println();

        // Assignment 3: Composite Pattern - Menu System
        System.out.println("=== Assignment 3: Composite Pattern - Menu System ===");
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning meals");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");

        MenuComponent pancake = new MenuItem("Pancake", "Sweet pancake", 5.99);
        MenuComponent sandwich = new MenuItem("Sandwich", "Ham sandwich", 6.99);

        breakfastMenu.add(pancake);
        lunchMenu.add(sandwich);

        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);

        allMenus.print();
        System.out.println();

        // Assignment 4: Decorator Pattern - Pizza Ordering System
        System.out.println("=== Assignment 4: Decorator Pattern - Pizza Ordering System ===");
        Pizza pizza = new MargheritaPizza();
        pizza = new CheeseTopping(pizza);
        pizza = new MushroomTopping(pizza);

        System.out.println("Pizza Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());
        System.out.println();

        // Assignment 5: Facade Pattern - Smart Home System
        System.out.println("=== Assignment 5: Facade Pattern - Smart Home System ===");
        SmartHomeFacade smartHome = new SmartHomeFacade(new Lights(), new Thermostat(), new SecuritySystem(), new EntertainmentSystem());
        smartHome.arriveHome();
        smartHome.movieMode();
        System.out.println();

        // Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor
        System.out.println("Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor");
        TextEditor textEditor = new TextEditor();
        textEditor.addCharacter('H', "Arial", 12, 1, 1);
        textEditor.addCharacter('e', "Arial", 12, 2, 1);
        textEditor.addCharacter('l', "Arial", 12, 3, 1);
        textEditor.addCharacter('l', "Arial", 12, 4, 1);
        textEditor.addCharacter('o', "Arial", 12, 5, 1);

        textEditor.render();

        // Assignment 7: Proxy Pattern - Online Learning Platform
        System.out.println("\nAssignment 7: Proxy Pattern - Online Learning Platform");
        OnlineCourse onlineCourse = new OnlineCourse();

        // Adding proxy video lectures
        onlineCourse.addVideoLecture(new ProxyVideoLecture("Design Patterns Overview"));
        onlineCourse.addVideoLecture(new ProxyVideoLecture("Adapter Pattern"));
        onlineCourse.addVideoLecture(new ProxyVideoLecture("Proxy Pattern"));
    }
}

