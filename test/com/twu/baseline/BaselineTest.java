package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

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

    @Test
    public void shouldReturnTheInputForOneRow() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X\nX\n-".getBytes());
        System.setIn(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        Baseline baseline = new Baseline();
        ArrayList<String> rowInput = baseline.getRowInput();

        testInput.add("X");
        testInput.add("X");
        testInput.add("-");

        assertEquals(testInput, rowInput);
    }
}
