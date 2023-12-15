
public class Voiture { 
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarree;

    private Moteur moteur;
    private Roue[] roues;

    public Voiture(String modele, String marque, Moteur moteur, Roue[] roues) {
        this.modele = modele;
        this.marque = marque;
        this.vitesse = 0;
        this.estDemarree = false;

        this.moteur = moteur;
        this.roues = roues;
    }

    public int deQuellePuissance() {
        return moteur.getPuissance();
    }
    public void demarre() {
        estDemarree = true;
        System.out.println("voiture est demarre.");
    }
    public void accelere(double reel) {
        if(estDemarree) {
            vitesse += reel;
            System.out.println("vitesse de "+vitesse+" km/h");
        } else {System.out.println("demarre la voiture!!");}
    }

    public void distanceConduiteDeMoteur(int distance){
        moteur.setKilometrage(distance);
    }
    public void changerLeMoteur(Moteur nouveauMoteur) {
        if (moteur.getKilometrage() >= 300000) {
            this.moteur = nouveauMoteur;
        } 
    }


    // Getters and Setters

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public boolean isEstDemarree() {
        return estDemarree;
    }

    public void setEstDemarree(boolean estDemarree) {
        this.estDemarree = estDemarree;
    }

    public Roue[] getRoues() {
        return roues;
    }

    public void setRoues(Roue[] roues) {
        this.roues = roues;
    }


    public Moteur getMoteur() {
        return moteur;
    }
    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
        moteur.setVoiture(this); 
    }

}