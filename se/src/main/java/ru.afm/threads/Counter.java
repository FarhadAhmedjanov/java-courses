package ru.afm.threads;

public class Counter {
    private static int amount;

    public synchronized int incerase(){
        return ++amount;
    }
}
