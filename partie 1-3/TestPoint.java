class TestPoint{
    public static void main(String[] args){
        Point p = new Point();
        p.setX(1);
        p.setY(2);

        // compilation error car ils sont prive
        // System.out.println(p.x);  
        // System.out.println(p.y);

        // si x et y sont publics donc on peut avoir un acces direct. mais c'est mieux d'avoir prive pour ne viole pas le concept d'encapsulation
       
        System.out.println("valeurs des points: (" + p.getX() + ", " + p.getY() + ")");
        
        p.deplacerPointPar(0,1);
        System.out.println("valeurs des points apres deplacement: (" + p.getX() + ", " + p.getY() + ")");
       
        p.reset();
        System.out.println("valeurs apres reset: (" + p.getX() + ", " + p.getY() + ")");

        // test des methodes distance :
        p.setX(1);
        p.setY(2);
        Point p2 = new Point();
        p2.setX(2);
        p2.setY(3);
        // distance() est une methode d'instance mais distanceV2() est une methode de class(statique) c'est pour cela on l'appel avec le nom de la class  
        System.out.println("distance entre p(1,2) et p2(2,3) avec la methode d'instance = "+p.distance(p2));
        System.out.println("distance entre p(1,2) et p2(2,3) avec la methode statique = "+Point.distanceV2(p,p2));

        // egalite entre deux objets 
        p.setX(4);
        p.setY(4);
        Point q = new Point();
        q.setX(4);
        q.setY(4);
        // apres la redifition to la method equals : 
        System.out.println("equals test 1 : " +p.equals(q)); // true
        Point q2;
        q2 = p;
        System.out.println("equals test 2 : " +p.equals(q2)); // true
        //avant la redefiniton du methode equals()
        //p.equals(q) => false 
        //p.equals(q2) => true
        // meme si p=(4,4) et q=(4,4) (meme valeurs) il va printer false car il compare les references et n'est pas les valeurs 
        // car on a redifiner cette methode afin qu'il compare maintenent les valeurs au lieu de comparer les references

        
        // question 5 : 
        //Object pp = new Point(2,5);
        //Object qq = new Point(2,5);
        // malheuresement il ne fonction pas, meme chose pour d'autres camarades de classe
        // il nous donne : error: constructor Point in class Point cannot be applied to given types; 
        // car on n'a pas encore de constructeur (avec constructeur il fonction sans problem)
        //System.out.println("equals pour question 5:" + pp.equals(qq));
        // mais s'il fonction il va printer false 
        // car la methode equals prend comme parametres un reference de type Point et dans le cas de pp et qq, leurs references sont de type Objet 
        // la redifition avec public boolean equals(Object a) il va printer true 


        // notion constructeur 
        Point a = new Point();
        Point b = new Point(5,2);
        // L'initialisation avec le constructeur consiste à créer un objet avec des valeurs spécifiques dès le début, tandis que l'affectation à l'aide des setters implique de modifier les valeurs d'un objet déjà existant. En d'autres termes, lors de l'initialisation, l'objet est créé avec des valeurs spécifiques dès le départ, tandis qu'avec l'affectation, vous modifiez les valeurs d'un objet qui existe déjà.

        // pour question 2 : 
        // java genere un constructeur par defaut donc Point a = new Point(); peut fonctionner 
        // si on ajoute un constructeur avec parametres, Point a = new Point(); ne va pas fonctionner et on va avoir un erreur car le compilateur ne genere plus automatiquement un constructeur par defaut donc on a besoin d'ajouter ce constructeur par defaut explicitement.


        // pour les autres questions de constructeur : 
        Point c1 = new Point();  // constructeur avec paramètres
        Point c2 = new Point(7, 7);  // constructeur avec paramètres
        Point c3 = new Point(7);     // constructeur avec un seul param

        // verification des valeur 
        System.out.println(c1.getX() + "," + c1.getY());  // 0, 0
        System.out.println(c2.getX() + "," + c2.getY());  // 7, 7
        System.out.println(c3.getX() + "," + c3.getY());  // 7, 0
        
        //toString
        Point pt = new Point(8,8);
        System.out.println(pt.toString());
    }

}