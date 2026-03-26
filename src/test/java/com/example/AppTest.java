package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void greetShouldReturnExpectedText() {
        App app = new App();
        Assertions.assertEquals("Hello, Java", app.greet("Java"));
    }
}
