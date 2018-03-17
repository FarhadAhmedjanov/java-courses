package ru.afm.Calculator;

import java.util.Scanner;


public class InteractRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "no";
        Calculator cl = new Calculator();
        boolean usePrevious = true;

        try {
            while (!exit.toLowerCase().equals("yes")) {
                System.out.printf("Use previous result: %f? Yes/No? ", cl.getResult());
                if (sc.next().toLowerCase().equals("no")){
                    usePrevious = false;
                    cl.cleanResult();
                }

                System.out.println("Enter first number: ");
                String first = sc.next();

                System.out.println("Enter second number: ");
                String second = sc.next();

                System.out.println("Enter operation (+, -, /, *): ");
                String operation = sc.next();

                if(usePrevious)
                    cl.calc(operation,cl.getResult(), Integer.valueOf(first), Integer.valueOf(second));
                else
                    cl.calc(operation, Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result: " + cl.getResult());
                usePrevious = true;

                System.out.println("Exit yes/no?");
                exit = sc.next();
            }
        } finally {
            sc.close();
        }
    }
}
