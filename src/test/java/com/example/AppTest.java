package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void greetShouldReturnExpectedText() {
        App app = new App();
        Assertions.assertEquals("Hello, Java", app.greet("Java"));
    }

    @Test
    void addShouldReturnSumOfTwoNumbers() {
        App app = new App();
        Assertions.assertEquals(5, app.add(2, 3));
    }

    @Test
    void isAdultShouldReturnTrueForAdultAge() {
        App app = new App();
        Assertions.assertTrue(app.isAdult(20));
    }

    @Test
    void isAdultShouldReturnFalseForMinorAge() {
        App app = new App();
        Assertions.assertFalse(app.isAdult(16));
    }
}
