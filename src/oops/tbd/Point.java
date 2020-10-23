package oops.tbd;


class Point implements Cloneable {
    protected int x, y;
    
    public Object Clone() {
        try {
            Point tmp = (Point) super.clone();
            return tmp;
        } catch (CloneNotSupportedException ex) {
            // cannot get here: List implements Cloneable, so do arrays
            throw new InternalError(ex.toString());
        }
    }
    // no-arg constructor
    public Point() {
        System.out.println("no-arg base class\n");
        x = y = 0;
    }
    
    // constructor with 2 args
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }

    public int getX() {
        return x;
    }
    
}

/*
 * Define a class ColorPoint that: is a subclass of the Point class has a
 * (protected) field of type String called color (in addition to fields x and y)
 * has 3 public constructors: 0 args: x and y are set to 0; color is set to
 * "red"; 2 int args: x and y are set to the given values; color is set to "red"
 * 2 int args and 1 String arg: x, y, and color are set to the given values
 */

 class ColorPoint extends Point {
     protected String color;
     public ColorPoint() {
         this(0, 0, "red");
        System.out.println("no-arg sub class\n");
        
     }
     public ColorPoint(int a, int b) {
        this(a, b, "red");
        System.out.println("two-arg sub class\n");
     }

     public ColorPoint(int a, int b, String colorTemp) {
        System.out.println("three-arg sub class\n");
        x = a;
        y = b;
        color = colorTemp;
     }

     public Object Clone() {
         try {
             ColorPoint tmp = (ColorPoint) super.clone();
             return tmp;
         } catch (CloneNotSupportedException ex) {
             // cannot get here: List implements Cloneable, so do arrays
             throw new InternalError(ex.toString());
         }
     }

 }
