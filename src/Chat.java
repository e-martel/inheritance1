/**
 * @author Etienne Martel, MARE21078006
 */

public class Chat extends Animal {
    public static void methodeClasse() {
        System.out.println("Methode classe Chat");
    }

    @Override
    public void methodeInstance() {
        System.out.println("Methode instance de Chat");
    }

    public void methodeInstanceParam(Chat c) {
        System.out.println("Methode instance de Chat (Animal surdefinie, param Chat)");
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void mange() {
        System.out.println("Je mange des souris");
    }
}
