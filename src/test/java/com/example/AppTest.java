package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        App app = new App();
        int result = app.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        App app = new App();
        int result = app.add(-2, -3);
        Assert.assertEquals(-5, result);
    }

    @Test
    public void testAddPositiveAndNegative() {
        App app = new App();
        int result = app.add(5, -3);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testAddWithZero() {
        App app = new App();
        int result = app.add(5, 0);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testAddZeroAndZero() {
        App app = new App();
        int result = app.add(0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testAddLargeNumbers() {
        App app = new App();
        int result = app.add(100000, 200000);
        Assert.assertEquals(300000, result);
    }

    @Test
    public void testAddResultNotEqual() {
        App app = new App();
        int result = app.add(2, 3);
        Assert.assertNotEquals(6, result);
    }
}