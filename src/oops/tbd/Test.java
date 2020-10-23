package oops.tbd;
public class Test {
    public static void main(String[] args) {
        ColorPoint p2 = new ColorPoint(1,2);
        ColorPoint p3 = p2;
        p3.setX(5);
        System.out.println(p2.getX());

        ColorPoint p5 = (ColorPoint)p2.Clone();
        p5.setX(100);
        System.out.println(p2.getX());

    }
}
