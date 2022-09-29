package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void factorialOfNumber0(){
        // given
        int number = 0;

        // when
        int actual = Factorial.factorialOfNumber(number);

        // then
        assertEquals(1, actual);
    }


    @Test
    public void factorialOfNumber6(){
        // given
        int number = 6;

        // when
        int actual = Factorial.factorialOfNumber(number);

        // then
        assertEquals(720, actual);
    }

    @Test
    public void factorialOfNumberWithWhileTest(){
        // given
        int number = 6;

        // when
        int actual = Factorial.factorialOfNumberWithWhile(number);

        // then
        assertEquals(720, actual);
    }

    @Test
    public void factorialTest(){
        assertEquals(1, Factorial.factorial(0));
    }

}