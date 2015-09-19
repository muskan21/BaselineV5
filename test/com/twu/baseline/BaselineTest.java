package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class BaselineTest {

    @Test
    public void shouldReturnTheAliveCellInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X".getBytes());
        System.setIn(byteArrayInputStream);
        String testInput;
        Baseline baseline = new Baseline();
        testInput = baseline.getInput();

        assertEquals("X", testInput);
    }

    @Test
    public void shouldReturnTheDeadCellInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("-".getBytes());
        System.setIn(byteArrayInputStream);
        String testInput;
        Baseline baseline = new Baseline();
        testInput = baseline.getInput();

        assertEquals("-", testInput);
    }
}
