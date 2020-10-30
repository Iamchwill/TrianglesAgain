public class Tester {
  public static void main(String[] args) {
    Point a = new Point(3,4);
    Point b = new Point(3,5);
    Point c = new Point(b);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(b.getX());
    System.out.println(b.getY());
    System.out.println(b.equals(c));
    System.out.println(a.equals(b));
    System.out.println(a.distanceTo(b));
  }
}
