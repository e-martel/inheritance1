/**
 * @author Etienne Martel, MARE21078006
 */

public class Animal implements Mammifere  {
    public static void methodeClasse(){
        System.out.println("Methode classe Animal");
    }

    public void methodeInstance(){
        System.out.println("Methode instance d'Animal");
    }

    public void methodeInstanceParam(Animal a){
        System.out.println("Methode instance d'Animal, param Animal");
    }

    public void mange(){
        System.out.println("Quelque chose!");
    }

}
