package oops2.DECORATOR;
public class Test {
    public static void main (String[] args) {
        Beverage b = new TypeB();
        b = new Choco(b);
        b = new Choco(b);
        b = new Cream(b);
        System.out.println(b.cost());
    }    
}
