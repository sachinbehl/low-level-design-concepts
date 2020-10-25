package oops2.DECORATOR;

public abstract class Notifier {
    protected Notifier() {}

    public abstract void Notify();
}

class BaseNotifier extends Notifier {
    BaseNotifier() {

    }

    public void Notify() {
        System.out.println("Notifying basic\n");
    }
}

abstract class NotifierDecorator extends Notifier {
    Notifier n;

    protected NotifierDecorator() {

    }
}

class SMSNotifier extends NotifierDecorator {
    SMSNotifier(Notifier n) {
        this.n = n;
    }

    public void Notify() {
        n.Notify();
        System.out.println("SMSNotifier called\n");
    }
}