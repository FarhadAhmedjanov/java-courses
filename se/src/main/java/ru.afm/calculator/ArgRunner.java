package ru.afm.calculator;

public class ArgRunner {
    public static void main(String[] args) {
        System.out.println("Calculating ...");
        if(args.length == 2){
            int first = Integer.valueOf(args[0]);
            int second = Integer.valueOf(args[1]);
            Calculator cl = new Calculator();
            cl.add(first, second);
            System.out.println("Result: " + cl.getResult());
            cl.cleanResult();
        } else{
            System.out.println("Enter two parameters.");
        }
    }
}
