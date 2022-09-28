package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SummeTest {

    @Test
    public void summeTest(){
        // GIVEN
        int val1 = 1;
        int val2 = 2;

        // WHEN
        int actual = Summe.summe(val1, val2);

        // THEN
        assertEquals(3, actual);

    }
    @Test
    public void summeTestWithNegativeNumbers(){
        // GIVEN
        int val1 = 1;
        int val2 = -2;

        // WHEN
        int actual = Summe.summe(val1, val2);

        // THEN
        assertEquals(-1, actual);

    }

    @Test
    public void checkValueTestExpectFalse(){
        //GIVEN
        int val1 = 10;
        int val2 = 20;

        //WHEN
        boolean actual = Summe.checkValue(val1, val2);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void checkValueTestExpectTrue(){
        //GIVEN
        int val1 = 20;
        int val2 = 200;

        //WHEN
        boolean actual = Summe.checkValue(val1, val2);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void checkValueTestWithNumbersEqualHundert(){
        //GIVEN
        int val1 = 100;
        int val2 = 100;

        //WHEN
       boolean actual = Summe.checkValue(val1, val2);

        //THEN
        assertFalse(actual);
    }

}