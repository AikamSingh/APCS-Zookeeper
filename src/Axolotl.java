/**
 * Axolotl from mwinecwaft
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class Axolotl extends Animal{
    private enum Color {PINK, GREEN, YELLOW, BLUE, BROWN};

    Color color;

    /**
     * @param animalType type of animal
     * @param value worth of animal
     * @param color color of Axolotl
     */
    public Axolotl(String animalType, double value, Color color) {
        super(animalType, value);
        this.color = color;
    }

    /**
     * gets the color of the Axolotl
     * @return color of Axolotl
     */
    public Color getColor() {
        return color;
    }

    /**
     * toString for Axolotl class
     * @return information about Axolotl
     */
    public String toString(){
        return super.toString() + "[color=" + color + "]";
    }
}
