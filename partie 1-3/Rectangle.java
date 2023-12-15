// Rectangle.java
public class Rectangle {
    private Point hg; // Le coin haut à gauche 
    private Point bd; // Le coin bas à droite

    public Rectangle() {
        // Rectangle par defaut. choisir son initialisation
        this.hg = new Point(0, 2);
        this.bd = new Point(1, 0);
    }

    public Rectangle(Point h, Point b) {
        // Initialisation des coins avec parametres en utilisant constructeur par copie de class Point
        this.hg = new Point(h);
        this.bd = new Point(b);
        // je pense que l'interet de faire ca est d'eviter ce type de code : 
        //this.hg = h;
        //this.bd = b;        
        // car l'affectation des reference passées en parametres aux "this.hg" et "this.bd" va introduire des problems : si on modifier les instances de Point hors Rectangle dans le Main(), ca va affecte aussi les points a l'interieure de Rectangle 
        // donc cette methode garantit que les instances Point dans le rectangle sont distinctes de celles passees en parametres.
    }

    public void afficher() {
        // affiche les coordonnees des coins
        System.out.println("haut a gauche : (" + hg.getX() + ", " + hg.getY() + ")");
        System.out.println("bas a droite : (" + bd.getX() + ", " + bd.getY() + ")");
    }

    public int surface() {
        // calcul de la surface
        int largeur = Math.abs(bd.getX() - hg.getX());
        int hauteur = Math.abs(bd.getY() - hg.getY());
        return largeur * hauteur;
    }

    public void zoom(int deltax, int deltay) {
        // dilatation des coordonnees. Delta donne.
        hg.setX(hg.getX() - deltax);
        hg.setY(hg.getY() - deltay);
        bd.setX(bd.getX() + deltax);
        bd.setY(bd.getY() + deltay);
    }

    // Getters and Setters
    public Point getHg() {
        return hg;
    }

    public void setHg(Point hg) {
        this.hg = hg;
    }

    public Point getBd() {
        return bd;
    }

    public void setBd(Point bd) {
        this.bd = bd;
    }
}
