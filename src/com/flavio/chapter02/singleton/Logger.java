package com.flavio.chapter02.singleton;

public class Logger {

    private Logger() { }

    private static Logger myInstance;

    public static synchronized Logger getInstance() {
        if(myInstance == null) {
            myInstance = new Logger();
        }
        return myInstance;
    }

    public void log(String s) {
        System.err.println(s);
    }
}
