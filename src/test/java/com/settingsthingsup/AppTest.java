package com.settingsthingsup;
import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest {

    @Test
    public void testAdd() {
        App calculator = new App();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract(){
        App calculator = new App();
        int result = calculator.subtract(7, 4);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply(){
        App calculator = new App();
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivide(){
        App calculator = new App();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}