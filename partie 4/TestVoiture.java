
public class TestVoiture {
    public static void main(String[] args) {

        //Moteur moteur = new Moteur("Essence", 200);
        

        Roue[] roues = {
            new Roue(20, 20),
            new Roue(20, 20),
            new Roue(20, 20),
            new Roue(20, 20),
            new Roue(20, 20) // extra
        };

        //Voiture voiture = new Voiture("Sedan", "Toyota", moteur, roues);
        Voiture voiture = new Voiture("Sedan", "Toyota", null, roues);
        Moteur moteur = new Moteur("Essence", 200, voiture);
        voiture.setMoteur(moteur);

 
        System.out.println("Puissance du moteur : " + voiture.deQuellePuissance() + " chevaux.");
        voiture.demarre();
        voiture.accelere(60);
        voiture.distanceConduiteDeMoteur(300000);
        Moteur moteur2 = new Moteur("Gasoile", 200,voiture);
        voiture.changerLeMoteur(moteur2);
    }
}
