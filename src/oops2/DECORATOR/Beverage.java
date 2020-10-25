package oops2.DECORATOR;

public abstract class Beverage {
    protected Beverage() {

    }

    public abstract  int cost();
}

class Latte extends Beverage {
    public Latte() {

    }

    @Override
    public int cost() {
        return 10;
    }
}

class TypeB extends Beverage {
    public TypeB() {

    }
    
    @Override
    public int cost() {
        return 20;
    }
}


abstract class Decorator extends Beverage {
    protected Beverage b;
    protected Decorator() {
    }
}

class Cream extends Decorator {
    public Cream(Beverage b) {
        this.b = b;
    }

    @Override
    public int cost() {
        return b.cost() + 5;
    }
}

class Choco extends Decorator {
    public Choco(Beverage b) {
        this.b = b;
    }

    @Override
    public int cost() {
        return b.cost() + 7;
    }
}


