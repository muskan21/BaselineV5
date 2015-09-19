package com.twu.baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class Baseline {
    ConsoleInput consoleInput;

    public Baseline(ConsoleInput consoleInput) {
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
        ArrayList<ArrayList<String>> gridInput = new ArrayList<ArrayList<String>>();
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("X", "X", "-"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("X", "-", "X"));
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("-", "X", "-"));
        gridInput.add(row1);
        gridInput.add(row2);
        gridInput.add(row3);
        return gridInput;
    }
}
