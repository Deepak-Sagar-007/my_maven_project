package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    void testAddPositiveNumbers() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        App app = new App();
        assertEquals(-5, app.add(-2, -3));
    }

    @Test
    void testAddPositiveAndNegative() {
        App app = new App();
        assertEquals(1, app.add(3, -2));
    }

    @Test
    void testAddWithZero() {
        App app = new App();
        assertEquals(3, app.add(3, 0));
    }

    @Test
    void testAddZeroAndZero() {
        App app = new App();
        assertEquals(0, app.add(0, 0));
    }
}