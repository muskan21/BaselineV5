package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GridTest {

    @Test
    public void shouldCompareFirstMemberCellToItsHorizontallyRightNeighborAndReturnTrueIfItIsX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX\nXX".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "right");

        assertTrue(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsHorizontallyRightNeighborAndReturnFalseIfItIsNotX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\nXX".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "right");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsHorizontallyLeftNeighborAndReturnFalse() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX\nXX".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "left");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsVerticallyAboveNeighborAndReturnFalse() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("XX\nXX".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "up");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsVerticallyBelowNeighborAndReturnTrueIfItsX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\nXX".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "down");

        assertTrue(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsVerticallyBelowNeighborAndReturnFalseIfItIsNotX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\n-X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "down");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsDiagonallyRightBelowNeighborAndReturnTrueIfItIsX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\n-X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "downright");

        assertTrue(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsDiagonallyRightBelowNeighborAndReturnFalseIfItIsNotX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\n--".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "downright");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsDiagonallyRightAboveNeighborAndReturnFalse() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\n-X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "upright");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsDiagonallyLeftAboveNeighborAndReturnFalse() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\n-X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "upleft");

        assertFalse(result);
    }

    @Test
    public void shouldCompareFirstMemberCellToItsDiagonallyLeftBelowNeighborAndReturnFalse() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X-\n-X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        boolean result = grid.compare(0, "downleft");

        assertFalse(result);
    }
}
