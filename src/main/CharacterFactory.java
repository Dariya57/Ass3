package src.main;

class CharacterFactory {
    private Map<Character, Character> characterMap = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        Character character = characterMap.get(value);
        if (character == null) {
            character = new Character(value, font, size);
            characterMap.put(value, character);
        }
        return character;
    }
}