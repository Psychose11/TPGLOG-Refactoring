package iut.bad;

public class Femme extends Humain {
    // Constructeur
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Femme Rasoa = new Femme("Rasoa", "Zanany", 25);
        Homme Rakoto= new Homme("Rakoto", "Kely", 30);

        
        
        Rakoto.manger();
        Rasoa.boire();
        
        Rasoa.manger();
        
        
        Rakoto.ami(Rasoa);
    }
}
