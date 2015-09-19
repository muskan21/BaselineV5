package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ApplicationInputTest {
    @Test
    public void shouldReturnTheInputForOneRowFromAGivenStringInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ArrayList<String> testInput = new ArrayList<String>();
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<String> rowInput = applicationInput.getRowInput();

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
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);

        ArrayList<String> rowInput = applicationInput.getRowInput();

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
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> testInput = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("X", "X", "-"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("X", "-", "X"));
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("-", "X", "-"));
        testInput.add(row1);
        testInput.add(row2);
        testInput.add(row3);

        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();

        assertEquals(gridInput, testInput);
    }

    @Test
    public void shouldReturnTheInputForAnptherGridFromVariousStringInputs() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XXX\nX-X\n-X-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> testInput = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("X", "X", "X"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("X", "-", "X"));
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("-", "X", "-"));
        testInput.add(row1);
        testInput.add(row2);
        testInput.add(row3);

        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();

        assertEquals(gridInput, testInput);
    }

    @Test
    public void shouldReturnTheInputForATwoSizeGridFromVariousStringInputs() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX\nX-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> testInput = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("X", "X"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("X", "-"));
        testInput.add(row1);
        testInput.add(row2);

        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();

        assertEquals(gridInput, testInput);
    }
}
