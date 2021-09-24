package com.joantolos.two.sum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldComplyWithExampleOne() {
        int[] solution = twoSum.exponentialAlgorithm(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, solution);
    }

    @Test
    public void shouldComplyWithExampleTwo() {
        int[] solution = twoSum.exponentialAlgorithm(new int[]{3, 2, 4}, 6);
        Assert.assertArrayEquals(new int[]{1, 2}, solution);
    }

    @Test
    public void shouldComplyWithExampleThree() {
        int[] solution = twoSum.exponentialAlgorithm(new int[]{3, 3}, 6);
        Assert.assertArrayEquals(new int[]{0, 1}, solution);
    }

}
