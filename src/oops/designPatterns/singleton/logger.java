package oops.designPatterns.singleton;

import java.io.IOException;
import java.io.PrintStream;

public class logger {
    private static logger inst;
    PrintStream ps;
    private logger() {
        try {
            ps = new PrintStream("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static logger getInstance() {
        if (inst == null) {
            inst = new logger();
        }
        return inst;
    }
    public void add(String txt) {
        ps.println(txt);
    }
}


