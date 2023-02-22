/**
 * Axolotl from mwinecwaft
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class Axolotl extends Animal{
    private enum Color {PINK, GREEN, YELLOW, BLUE, BROWN};

    Color color;

    public Axolotl(String animalType, double value, Color color) {
        super(animalType, value);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String toString(){
        return super.toString() + "[color=" + color + "]";
    }
}
