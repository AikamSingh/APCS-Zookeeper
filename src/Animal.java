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

    public Animal(int idTag, String animalType, double value){
        this.idTag = idTag;
        this.animalType = animalType;
        this.value = value;
    }

    public int getIdTag(){
        return idTag;
    }

    public double getValue(){
        return value;
    }

    public String getAnimalType(){
        return animalType;
    }

    public String toString(){
        return "Animal[idTag=" + idTag + ", animalType=" + animalType + ", value=" + value + "]";
    }


}
