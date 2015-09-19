package com.twu.baseline;

import java.util.ArrayList;

public class ApplicationInput {
    private ArrayList<ArrayList<String>> grid = new ArrayList<ArrayList<String>>();
    private ConsoleInput consoleInput;

    public ApplicationInput(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public ArrayList<String> getRowInput() {
        String input = consoleInput.getInput();
        int length = input.length();
        ArrayList<String> rowInput = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            rowInput.add((input.substring(i, i+1)));
        }
        return rowInput;
    }

    public ArrayList<ArrayList<String>> getGridInput() {
        ArrayList<String> row1 = getRowInput();
        ArrayList<String> row2 = getRowInput();
        ArrayList<String> row3 = getRowInput();
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        return grid;
    }
}
