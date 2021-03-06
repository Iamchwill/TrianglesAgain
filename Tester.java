public class Tester {
  public static void main(String[] args) {
    Point a = new Point(3,4);
    Point b = new Point(3,5);
    Point c = new Point(b);
    Point d = new Point(2,4);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(b.getX());
    System.out.println(b.getY());
    System.out.println(b.equals(c));
    System.out.println(a.equals(b));
    System.out.println(a.distanceTo(b));
    Triangle t1 = new Triangle(0,0, 0,3, 4,0);
    Triangle t2 = new Triangle(a, b, d);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t2.getPerimeter());
    System.out.println(t2.getArea());
    Triangle t3 = new Triangle(0,0, 4,0, 2,2 * Math.sqrt(3));
    System.out.println(t1.classify());
    System.out.println(t2.classify());
    System.out.println(t3.classify());
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    t1.setVertex(0, c);
    System.out.println(t1);
    t1.setVertex(1, c);
    System.out.println(t1);
    t1.setVertex(2, c);
    System.out.println(t1);
  }
}
