/**
 * write description
 *
 * @author Aikam Singh
 * @version 2/22/23
 */

public class ZookeeperRunner {
    public static void main(String[] args) {
        Animal a = new Animal("tiger", 1);
        Animal b = new Animal("lion", 2);
        Animal c = new Animal("jaguar", 3);

        Zookeeper zookeeper = new Zookeeper();
        zookeeper.addAnimal(a);
        zookeeper.addAnimal(b);
        zookeeper.addAnimal(c);
        zookeeper.feed();
        System.out.println(zookeeper.getAnimalInventory());
        System.out.println(zookeeper.findMostValuable());
    }
}
