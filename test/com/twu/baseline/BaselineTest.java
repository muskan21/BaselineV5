package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class BaselineTest {

    @Test
    public void shouldReturnTheAliveCellInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        String testInput;
        Baseline baseline = new Baseline();
        testInput = baseline.getInput(scanner);

        assertEquals("X", testInput);
    }

    @Test
    public void shouldReturnTheDeadCellInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        String testInput;
        Baseline baseline = new Baseline();
        testInput = baseline.getInput(scanner);

        assertEquals("-", testInput);
    }

    @Test
    public void shouldReturnTheInputForOneRow() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X\nX\n-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        Baseline baseline = new Baseline();
        ArrayList<String> rowInput = baseline.getRowInput(scanner);

        testInput.add("X");
        testInput.add("X");
        testInput.add("-");

        assertEquals(testInput, rowInput);
        System.setIn(System.in);
    }

    @Test
    public void shouldReturnTheInputForAnotherSize3Row() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X\n-\n-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        Baseline baseline = new Baseline();
        ArrayList<String> rowInput = baseline.getRowInput(scanner);

        testInput.add("X");
        testInput.add("-");
        testInput.add("-");

        assertEquals(testInput, rowInput);
        System.setIn(System.in);
    }
}
