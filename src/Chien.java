/**
 * @author Etienne Martel, MARE21078006
 */

public class Chien extends Animal {
    public static void methodeClasse(){
        System.out.println("Methode classe Chien");
    }

    public void methodeInstance(){
        System.out.println("Methode instance Chien");
    }

    public void methodeInstanceParam(Object a){
        System.out.println("Methode instance Chien (Animal surdefinie, param Object)");
    }

}
