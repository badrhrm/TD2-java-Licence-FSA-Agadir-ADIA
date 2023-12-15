// TestRectangle.java
public class TestRectangle {
    public static void main(String[] args) {
        Point hg = new Point(2, 2);
        Point bd = new Point(3, 5);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(hg, bd);

        System.out.println("rectangle 1:");
        rectangle1.afficher();
        System.out.println("surface : " + rectangle1.surface());

        System.out.println("##############");
        System.out.println("rectangle 2:");
        rectangle2.afficher();
        System.out.println("surface : " + rectangle2.surface());

        // Test zoom
        System.out.println("##############");
        rectangle2.zoom(2, 2);
        System.out.println("rectangle 2 apres zoom :");
        rectangle2.afficher();
        System.out.println("surface : " + rectangle2.surface());

        
    }
}
