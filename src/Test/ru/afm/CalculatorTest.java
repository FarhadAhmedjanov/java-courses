package ru.afm;

import org.junit.Test;
import ru.afm.Calculator.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calc() {
        //Assign block
        Calculator cl = new Calculator();
        String operation = "+";
        double param1 = 12;
        double param2 = 14;
        double expected = 26;

        //act block
        cl.calc(operation,param1, param2);

        //assert block
        assertEquals(expected, cl.getResult(),0);
    }

    @Test
    public void add() {
        //assign block
        Calculator cl = new Calculator();
        //act block
        cl.add(0, 1);
        //assert block
        assertEquals(1, cl.getResult(), 0);
    }

    @Test
    public void sub() {
        //assign block
        Calculator cl = new Calculator();
        //act block
        cl.sub(0, 1);
        //assert block
        assertEquals(-1, cl.getResult(), 0);
    }

    @Test
    public void div() {
        //assign block
        Calculator cl = new Calculator();
        //act block
        cl.div(0, 1);
        //assert block
        assertEquals(0, cl.getResult(), 0);
    }

    @Test
    public void mult() {
        //assign block
        Calculator cl = new Calculator();
        //act block
        cl.mult(0, 1);
        //assert block
        assertEquals(0, cl.getResult(), 0);
    }

    @Test
    public void cleanResult() {
        //assign block
        Calculator cl = new Calculator();
        //act block
        cl.cleanResult();
        //assert block
        assertEquals(0, cl.getResult(), 0);
    }

    @Test
    public void getResult() {
        //assing block
        Calculator cl = new Calculator();
        //assert block
        assertEquals(0, cl.getResult(), 0);
    }
}