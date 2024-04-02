package iut.bad;

public class Humain implements Consommation {
    // Champs communs à tous les humains
    protected String nom;
    protected String prenom;
    protected int age;
    protected int dureeAmitie; // Durée de l'amitié en jours

    // Constructeur
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dureeAmitie = 100; // Durée de l'amitié par défaut
    }

    // Méthode pour afficher les détails de l'humain
    public void details() {
        System.out.println(toString());
    }

    // Méthode toString pour obtenir une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", Durée de l'amitié: " + dureeAmitie + " jours";
    }

    // Implémentation de la méthode pour manger
    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    // Implémentation de la méthode pour boire
    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }

    // Méthode pour indiquer une amitié
    public void ami(Humain autre, int dureeAmitie) {
        this.dureeAmitie = dureeAmitie;
        autre.dureeAmitie = dureeAmitie;
        System.out.println(this.nom + " et " + autre.nom + " sont désormais amis pour " + dureeAmitie + " jours !");
    }

    // Surcharge de la méthode ami
    public void ami(Humain autre) {
        this.ami(autre, 100); // 100 jours durée par défaut
    }

    // Getters Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDureeAmitie() {
        return dureeAmitie;
    }

    public void setDureeAmitie(int dureeAmitie) {
        this.dureeAmitie = dureeAmitie;
    }
}
