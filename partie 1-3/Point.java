class Point{
    
    private int x;
    private int y;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return this.y;
    }

    public void deplacerPointPar(int z1,int z2){
        this.x+=z1;
        this.y+=z2;
    }
    public void reset(){
        this.x=0;
        this.y=0;
    }
    public double distance(Point b){
        return Math.sqrt( Math.pow(this.x-b.x,2) + Math.pow(this.y-b.y,2) );
    }
    public static double distanceV2(Point a , Point b){
        return Math.sqrt( Math.pow(a.x-b.x,2) + Math.pow(a.y-b.y,2) );
    }
    public boolean equals(Point a){
        return (this.x==a.x && this.y==a.y);
    }   
    public boolean equals(Object a){
        return (this.x==((Point)a).x && this.y==((Point)a).y);
    }   
    // public boolean equals(Object a) {
    //     Point point = (Point) a;
    //     return this.x == point.x && this.y == point.y;
    // }
    
    // constructors:
    //public Point(){x=0; y=0;}
    public Point(int a, int b){x=a; y=b;}
    //public Point(){this(0,0);}
    
    // voici les constructeur de deux façons différentes : 
    // façons 1 : 
    // public Point(int a) {x = a; y = 0;}
    // façons 2 : 
    public Point(int a) { this(a, 0);}
    //Vérifier qu'on peut réécrire le constructeur (par défaut) par {this (0);} : 
    public Point(){this(0);}

    public String toString(){return ("toString: ("+x+","+y+")");}


    // partie 4 :
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
}