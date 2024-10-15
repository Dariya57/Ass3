package src.main;
import java.util.*;
public class Menu extends MenuComponent {
    String name;
    String description;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public void print() {
        System.out.println("\nMenu: " + name + ", Description: " + description);
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }
}