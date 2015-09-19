package com.twu.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaselineTest {

    @Test
    public void shouldReturnTheInput() {
        String testInput;
        Baseline baseline = new Baseline();
        testInput = baseline.getInput();

        assertEquals("X", testInput);
    }
}
