package ru.afm.Calculator;

public class Calculate{
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println("Calculating...");
        System.out.println("Sum = " + (a+b));
    }
}