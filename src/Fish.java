/**
 * write description
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class Fish extends Animal{
    private enum Environment {FRESHWATER, SALTWATER};
    private Environment waterType;

    /**
     * constructor for the Fish class
     * @param animalType name of animal
     * @param value animal worth
     * @param waterType environment that the animal lives in
     */
    public Fish(String animalType, double value, Environment waterType) {
        super(animalType, value);
        this.waterType = waterType;
    }

    /**
     * gets the environment that the fish should live in
     * @return water type for fish
     */
    public Environment getWaterType(){
        return waterType;
    }

    /**
     * toString for the Fish class
     * @return information about Fish
     */
    public String toString(){
        return super.toString() + "[waterType=" + waterType + "]";
    }
}
