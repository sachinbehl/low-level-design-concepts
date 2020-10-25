package oops.designPatterns.singleton;

class Test {
    public static void main (String[] args) {
        logger l = logger.getInstance();
        l.add("sachin");
        logger l2 = logger.getInstance();
        l2.add("aman");
        System.out.println(l1.toString());
    }
}