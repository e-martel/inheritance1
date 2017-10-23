public class Main {

    public static void main(String[] args) {
        Animal bete = new Animal();

        Chat minou = new Chat();
        Animal chanimal = new Chat();

        Chien toutou = new Chien();
        Animal chienimal = new Chien();

        Lapin bugsBunny = new Lapin();
        Animal lapinimal = new Lapin();

        System.out.println("\n=Variable Animal contient une instance Animal=");
        bete.methodeClasse();
        bete.methodeInstance();
        bete.methodeInstanceParam(new Chat());
        bete.methodeInstanceParam(new Animal());

        System.out.println("\n=Variable Chat contient une instance de chat=");
        minou.methodeClasse();
        minou.methodeInstance();
        minou.methodeInstanceParam(new Chat());
        minou.methodeInstanceParam(new Animal());
        minou.meow(); // definie
        minou.mange(); // heritee

        System.out.println("\n=Variable Animal contient une instance de chat=");
        chanimal.methodeClasse();
        chanimal.methodeInstance();
        chanimal.methodeInstanceParam(new Chat()); /// Je ne comprends pas pquoi ca n'appelle pas la methode de la classe Chat.
        chanimal.methodeInstanceParam(new Animal());
        // chanimal.meow();
        // Impossible si Animal n'a pas de meow(), chanimal est un Animal.
        // Meme si il contient un chat.

        // Si chanimal contient un meow quelconque... on pourra
        // utiliser meow pour chanimal et il fera appel a celui
        // de l'instance Chat


        System.out.println("\n=Variable chien contient une instance de chien=");
        toutou.methodeClasse();
        toutou.methodeInstance();
        toutou.methodeInstanceParam(new Chat());
        toutou.methodeInstanceParam(new Animal());

        System.out.println("\n=Variable Animal contient une instance de chien=");
        chienimal.methodeClasse();
        chienimal.methodeInstance();
        chienimal.methodeInstanceParam(new Chien());
        chienimal.methodeInstanceParam(new Animal());

        System.out.println("\n=Variable Lapin contient une instance de Lapin=");
        bugsBunny.methodeClasse();
        bugsBunny.methodeInstance();
        bugsBunny.methodeInstanceParam(new Chat());
        bugsBunny.methodeInstanceParam(new Animal());

        System.out.println("\n=Variable Animal contient une instance de lapin=");
        lapinimal.methodeClasse();
        lapinimal.methodeInstance();
        lapinimal.methodeInstanceParam(new Lapin());
        lapinimal.methodeInstanceParam(new Animal());

        System.out.println("\n=Appel a la methode static de l'interface=");
        Mammifere.methodeClasse();

    }
}
