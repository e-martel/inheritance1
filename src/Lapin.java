/**
 * @author Etienne Martel, MARE21078006
 */

public class Lapin extends Animal {
    public static void methodeClasse() {
        System.out.println("Methode classe Lapin");
    }

    @Override
    public void methodeInstance() {
        System.out.println("Methode instance de Lapin");
    }

    public void methodeInstanceParam(Animal a) {
        System.out.println("Methode instance de Lapin (Animal redefinie, param Animal)");
    }

}
