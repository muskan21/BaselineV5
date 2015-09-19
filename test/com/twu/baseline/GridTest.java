package com.twu.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

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

        boolean result = grid.compare(0, 1);

        assertTrue(result);
    }
}
