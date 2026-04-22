package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3PracticeTest {

    @Test
    void addShouldReturnSum() {
        Assertions.assertEquals(8, Day3Practice.add(3, 5));
    }

    @Test
    void overloadedAddShouldReturnSum() {
        Assertions.assertEquals(6, Day3Practice.add(1, 2, 3));
    }

    @Test
    void maxShouldReturnLargerValue() {
        Assertions.assertEquals(10, Day3Practice.max(10, 8));
    }

    @Test
    void minShouldReturnSmallerValue() {
        Assertions.assertEquals(8, Day3Practice.min(10, 8));
    }

    @Test
    void isEvenShouldWorkCorrectly() {
        Assertions.assertTrue(Day3Practice.isEven(4));
        Assertions.assertFalse(Day3Practice.isEven(7));
    }

    @Test
    void sumArrayShouldReturnTotal() {
        Assertions.assertEquals(15, Day3Practice.sumArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void maxInArrayShouldReturnLargestValue() {
        Assertions.assertEquals(5, Day3Practice.maxInArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void averageShouldReturnCorrectValue() {
        Assertions.assertEquals(3.0, Day3Practice.average(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void containsShouldCheckTarget() {
        Assertions.assertTrue(Day3Practice.contains(new int[]{1, 2, 3, 4, 5}, 3));
        Assertions.assertFalse(Day3Practice.contains(new int[]{1, 2, 3, 4, 5}, 9));
    }

    @Test
    void countEvenShouldReturnCorrectCount() {
        Assertions.assertEquals(2, Day3Practice.countEven(new int[]{1, 2, 3, 4, 5}));
    }
}
