package org.example.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingTestTest {
    private CodingTest codingTest;

    @BeforeEach
    void setUp(){

        codingTest = new CodingTest();
    }

    @Test
    void testExercise3Success() {

        assertTrue(codingTest.exercise2(0));
        assertTrue(codingTest.exercise2(1));
        assertTrue(codingTest.exercise2(34));
        assertTrue(codingTest.exercise2(144));

        assertFalse(codingTest.exercise2(35));
        assertFalse(codingTest.exercise2(94));
    }

    @Test
    void testExercise3Error() {

       assertThrows(IllegalArgumentException.class, ()-> codingTest.exercise2(-3));
    }

    @Test
    void exercise5() {

        assertEquals("tegrat", codingTest.exercise5("target"));
        assertEquals("etadidnac", codingTest.exercise5("candidate"));
        assertEquals("devorpa", codingTest.exercise5("aproved"));
    }
}