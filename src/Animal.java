/**
 * this is the animal class for the Zookeeper project
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class Animal {
    private String animalType;
    private int idTag;
    private double value;

    /**
     * constructor for the Animal class
     * @param idTag id of animal
     * @param animalType type of animal
     * @param value animal worth
     */
    public Animal(int idTag, String animalType, double value){
        this.idTag = idTag;
        this.animalType = animalType;
        this.value = value;
    }

    /**
     * gets id of animal
     * @return id tag of animal
     */
    public int getIdTag(){
        return idTag;
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
     * toString of Animal class
     * @return toString of animal
     */
    public String toString(){
        return "Animal[idTag=" + idTag + ", animalType=" + animalType + ", value=" + value + "]";
    }


}
