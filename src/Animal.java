/**
 * this is the animal class for the Zookeeper project
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class Animal {
    private String animalType;
    private static int idTag = 999;
    private int id;
    private double value;
    private boolean isHungry;

    /**
     * constructor for the Animal class
     * @param animalType type of animal
     * @param value animal worth
     */
    public Animal(String animalType, double value){
        idTag++;
        id = idTag;

        this.animalType = animalType;
        this.value = value;
        isHungry = false;
    }

    /**
     * gets id of animal
     * @return id tag of animal
     */
    public int getIdTag(){
        return id;
    }

    /**
     * gets value of animal
     * @return worth of animal
     */
    public double getValue(){
        return value;
    }

    /**
     * gets animal type
     * @return animal type
     */
    public String getAnimalType(){
        return animalType;
    }

    /**
     * method checks to see if animal is hungry
     * @return if animal is hungry
     */
    public boolean isHungry(){
        int hunger = (int) (Math.random() * 10) + 1;
        isHungry = hunger > 8;

        return isHungry;
    }

    /**
     * feeds animal if it is hungry
     * @return message
     */
    public String feed(){
        if(isHungry){
            isHungry = false;
            return "animal fed";
        }
        return "animal is not hungry";
    }

    /**
     * toString of Animal class
     * @return toString of animal
     */
    public String toString(){
        return "Animal[idTag=" + idTag + ", animalType=" + animalType + ", value=" + value + "]";
    }


}
