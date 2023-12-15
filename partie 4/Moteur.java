
public class Moteur {
    private String nom;
    private int puissance;
    private int kilometrage;
    private Voiture voiture;

    public Moteur(String nom, int puissance,Voiture voiture) {
        this.nom = nom;
        this.puissance = puissance;

        this.kilometrage=0;
        this.voiture = voiture;
    }


    // Getters and Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }


    public int getKilometrage() {
        return kilometrage;
    }
    public void setKilometrage(int distance) {
        this.kilometrage += distance;
    }


    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    
}
