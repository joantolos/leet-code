package com.joantolos.two.sum;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldComplyWithExampleOne() {
        int[] solution = twoSum.run(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, solution[0]);
        Assert.assertEquals(1, solution[1]);
    }

    @Test
    @Ignore
    public void shouldComplyWithExampleTwo() {
        int[] solution = twoSum.run(new int[]{3, 2, 4}, 6);
        Assert.assertEquals(1, solution[0]);
        Assert.assertEquals(2, solution[1]);
    }

    @Test
    @Ignore
    public void shouldComplyWithExampleThree() {
        int[] solution = twoSum.run(new int[]{3, 3}, 6);
        Assert.assertEquals(0, solution[1]);
        Assert.assertEquals(1, solution[2]);
    }

}
