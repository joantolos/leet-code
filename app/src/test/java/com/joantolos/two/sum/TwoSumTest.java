package com.joantolos.two.sum;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldComplyWithExampleOne() {
        int[] solution = twoSum.run(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, solution[0]);
        Assert.assertEquals(1, solution[1]);
    }
}
