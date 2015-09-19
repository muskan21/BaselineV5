package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void shouldReturnTOneAliveNeighborsForAMemberCellIfOnlyRightNeighborIsX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("---\n--X\n---".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        int aliveCount = grid.countAliveNeighbors(1, 1);

        assertEquals(1, aliveCount);
    }

    @Test
    public void shouldReturnTwoAliveNeighborsForTheFirstMemberCellIfRightAndBelowNeighborIsX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("-X-\nX--\n---".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        int aliveCount = grid.countAliveNeighbors(0, 0);

        assertEquals(2, aliveCount);
    }

    @Test
    public void shouldReturnTwoAliveNeighborsForAMemberCellIfRightAndBelowNeighborIsX() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("--X\n-X-\n---".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ApplicationInput applicationInput = new ApplicationInput(consoleInput);
        ArrayList<ArrayList<String>> gridInput = applicationInput.getGridInput();
        Grid grid = new Grid(gridInput);

        int aliveCount = grid.countAliveNeighbors(0, 1);

        assertEquals(2, aliveCount);
    }
}
