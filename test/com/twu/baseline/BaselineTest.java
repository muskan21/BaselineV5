package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class BaselineTest {

    @Test
    public void shouldReturnTheInputForOneRow() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X\nX\n-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        Baseline baseline = new Baseline(consoleInput);
        ArrayList<String> rowInput = baseline.getRowInput();

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
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        Baseline baseline = new Baseline(consoleInput);
        ArrayList<String> rowInput = baseline.getRowInput();

        testInput.add("X");
        testInput.add("-");
        testInput.add("-");

        assertEquals(testInput, rowInput);
        System.setIn(System.in);
    }
}
