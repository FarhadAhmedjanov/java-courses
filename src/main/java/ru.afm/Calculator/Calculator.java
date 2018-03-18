package ru.afm.Calculator;

/**
 * @author Фархад
 * Execute arithmetic operations
 */
public class Calculator {

    /**
     * Contains result of operations
     */
    private double result;

    /**
     * Execute necessary operation
     * @param operation type of operation (+, -, *, /)
     * @param params Parameters on what make the operations
     */
    public void calc(String operation, double... params) throws UserException {
        switch (operation) {
            case "+":
                this.add(params);
                break;
            case "-":
                this.sub(params);
                break;
            case "*":
                this.mult(params);
                break;
            case "/":
                this.div(params);
                break;
            default:
                break;
        }
    }

    /**
     * Make additon
     * @param params
     */
    public void add(double... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result += params[i];
        }
    }

    /**
     * Make substraction
     * @param params
     */
    public void sub(double... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result -= params[i];
        }
    }

    /**
     * Make division
     * @param params
     */
    public void div(double... params) throws UserException {
        if(params.length > 0) {
            this.result = params[0];
            if(params[1] == 0){
                throw new IllegalArgumentException("Division to zero!");
            }
            for (int i = 1; i < params.length; i++) {
                this.result /= params[i];
            }
        } else{
            throw new UserException("Enter at least 2 parameters");
        }
    }

    /**
     * Make multiplication
     * @param params
     */
    public void mult(double... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result *= params[i];
        }
    }

    /**
     * Clean saved result
     */
    public void cleanResult() {
        this.result = 0;
    }

    /**
     * Return existing result
     * @return double
     */
    public double getResult() {
        return this.result;
    }
}
