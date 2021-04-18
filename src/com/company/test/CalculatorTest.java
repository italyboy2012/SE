package com.company.test;

import com.company.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = null;
    String shouldWorkBcBasics = "Sollte funktionieren, da Basics.";

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    @DisplayName("Grundlegende Additionen")
    void testAdd() {
        assertEquals(10, c.add(7,3), shouldWorkBcBasics);
        assertEquals(-20, c.add(10,-30), shouldWorkBcBasics);
    }
    
    @Test
    @DisplayName("Grundlegende Subtraktion")
    void testSubtract() {
        assertEquals(15, c.subtract(20,5), shouldWorkBcBasics);
        assertEquals(20, c.subtract(-20,-40), shouldWorkBcBasics);
    }

    @Test
    @DisplayName("Grundlegende Multiplikatoin")
    void testMultiply() {
        assertEquals(30, c.multiply(10,3), shouldWorkBcBasics);
        assertEquals(14, c.multiply(7,2), shouldWorkBcBasics);
        assertEquals(21, c.multiply(-7,-3), shouldWorkBcBasics);
    }

    @Test
    @DisplayName("Multiplikation mit 0")
    void testMultiplyWithZero() {
        assertEquals(0, c.multiply(10, 0), shouldWorkBcBasics);
        assertEquals(0, c.multiply(0, 30), shouldWorkBcBasics);
    }

    @Test
    @DisplayName("Grundlegende Division")
    void testDivide() {
        try {
            assertEquals(10, c.divide(20,2), shouldWorkBcBasics);
            assertEquals(7, c.divide(21,3), shouldWorkBcBasics);
            assertEquals(0, c.divide(0,2), shouldWorkBcBasics);
        } catch (Exception e) {
            fail("Grundlegende Division sollte funktionieren! \nFehler: "+e.toString());
        }
    }

    @Test
    @DisplayName("Division mit 0")
    void testDivideByZero() {
        try {
            assertEquals(10, c.divide(60,0), "Sollte nicht funktionieren, da durch 0 dividiert!");
            fail("Disivion durch 0 nicht möglich, hier aber geschehen!");
        } catch (Exception e) {
            System.out.println("Passed!");
        }
    }

}