package ru.afm;

public class Calculator {
    private double result;
    private String operation;

    public void calc(String operation, double... params) {
        switch (operation) {
            case "+":
                add(params);
                break;
            case "-":
                sub(params);
                break;
            case "*":
                mult(params);
                break;
            case "/":
                div(params);
                break;
            default:
                break;
        }
    }

    public void add(double... params) {
        result = params[0];
        for (int i = 1; i < params.length; i++) {
            result += params[i];
        }
    }

    public void sub(double... params) {
        result = params[0];
        for (int i = 1; i < params.length; i++) {
            result -= params[i];
        }
    }

    public void div(double... params) {
        result = params[0];
        for (int i = 1; i < params.length; i++) {
            result /= params[i];
        }
    }

    public void mult(double... params) {
        result = params[0];
        for (int i = 1; i < params.length; i++) {
            result *= params[i];
        }
    }

    public void cleanResult() {
        this.result = 0;
    }

    public double getResult() {
        return result;
    }
}
