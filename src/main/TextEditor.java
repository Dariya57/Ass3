package src.main;
import java.util.*;
public class TextEditor {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(char value, String font, int size, int x, int y) {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.getCharacter(value, font, size);
        character.display(x, y);
    }

    public void render() {
        for (Character character : characters) {
            character.display(0, 0); // display position is placeholder
        }
    }
}