import com.sun.prism.paint.Color;

/**
 * write description
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class ZookeeperRunner {
    public static void main(String[] args) {
        System.out.println("Creating all the animals");
        Animal a = new Animal("tiger", 1000);
        Animal b = new Animal("lion", 2000);
        Animal c = new Animal("jaguar", 3000);
        Axolotl axolotl = new Axolotl("axolotl", 1000000, Axolotl.Color.BLUE);
        Fish fishie = new Fish("fish", 10, Fish.Environment.SALTWATER);

        System.out.println("Creating zookeeper");
        Zookeeper zookeeper = new Zookeeper();

        System.out.println("Adding animals to the zoo");
        zookeeper.addAnimal(a);
        zookeeper.addAnimal(b);
        zookeeper.addAnimal(c);
        zookeeper.addAnimal(axolotl);
        zookeeper.addAnimal(fishie);

        System.out.println("Feeding al; the animals");
        zookeeper.feed();

        System.out.println("All the animals in the zoo: ");
        System.out.println(zookeeper.getAnimalInventory());

        System.out.println("Finding the most valuable animal in zoo: ");
        System.out.println(zookeeper.findMostValuable());
    }
}
