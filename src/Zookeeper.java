import java.util.ArrayList;

/**
 * write description
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class Zookeeper {
    ArrayList<Animal> zoo;
    public Zookeeper(){
        zoo = new ArrayList<>();
    }

    /**
     * adds an animal to the zoo
     * @param animal animal to add
     */
    public void addAnimal(Animal animal){
        zoo.add(animal);
    }

    /**
     * @return net worth of the zoo
     */
    public double getTotalWorth(){ //total worth of zoo class
        double total = 0;
        for(Animal animal : zoo){
            total += animal.getValue();
        }

        return total;
    }

    /**
     * feeds all the animals
     */
    public void feed(){
        for(Animal animal : zoo){
            animal.feed();
        }
    }

    /**
     * sorta like a toString method
     * @return animal inventory
     */
    public String getAnimalInventory(){
        String result = "Zookeeper[";
        for(int i = 0; i < zoo.size(); i++){
            if(i < zoo.size() - 1){
                result += zoo.get(i) + ", ";
            }
            else{
                result += zoo.get(i) + "]";
            }
        }
        return result;
    }

    /**
     * Returns the most valuable animal
     * @return the most valuable animal
     */
    public Animal findMostValuable(){
        Animal valuable = zoo.get(0);
        for(Animal animal : zoo){
            if(animal.getValue() >= valuable.getValue()){
                valuable = animal;
            }
        }

        return valuable;
    }

    /**
     * @param animal animal to gift away
     */
    public void giftAnimal(Animal animal){
        zoo.remove(animal);
    }
}
