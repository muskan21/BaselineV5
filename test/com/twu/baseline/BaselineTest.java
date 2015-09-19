package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BaselineTest {

    @Test
    public void shouldReturnTheInputForOneRowFromAGivenStringInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        Baseline baseline = new Baseline(consoleInput);
        ArrayList<String> rowInput = baseline.getRowInput();

        testInput.add("X");
        testInput.add("X");
        testInput.add("-");

        assertEquals(testInput, rowInput);
    }

    @Test
    public void shouldReturnTheInputForAnotherSize3RowFromAGivenStringInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X--".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        Baseline baseline = new Baseline(consoleInput);

        ArrayList<String> rowInput = baseline.getRowInput();

        testInput.add("X");
        testInput.add("-");
        testInput.add("-");
        assertEquals(testInput, rowInput);
    }

    @Test
    public void shouldReturnTheInputForAGridFromVariousStringInputs() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX-\nX-X\n-X-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        Baseline baseline = new Baseline(consoleInput);
        ArrayList<ArrayList<String>> testInput = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("X", "X", "-"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("X", "-", "X"));
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("-", "X", "-"));
        testInput.add(row1);
        testInput.add(row2);
        testInput.add(row3);

        ArrayList<ArrayList<String>> gridInput = baseline.getGridInput();

        assertEquals(gridInput, testInput);
    }

    @Test
    public void shouldReturnTheInputForAnptherGridFromVariousStringInputs() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XXX\nX-X\n-X-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        Baseline baseline = new Baseline(consoleInput);
        ArrayList<ArrayList<String>> testInput = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("X", "X", "X"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("X", "-", "X"));
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("-", "X", "-"));
        testInput.add(row1);
        testInput.add(row2);
        testInput.add(row3);

        ArrayList<ArrayList<String>> gridInput = baseline.getGridInput();

        assertEquals(gridInput, testInput);
    }
}
