package oops2.DECORATOR;

public class TEST2 {
    public static void  main(String[] args) {
        Notifier n = new BaseNotifier();
        n = new SMSNotifier(n);
        n.Notify();
    }
}
