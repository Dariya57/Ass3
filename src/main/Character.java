package src.main;

class Character {
    private char value; // Intrinsic state
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void display(int x, int y) {
        System.out.println("Character: " + value + " at (" + x + "," + y + "), Font: " + font + ", Size: " + size);
    }
}