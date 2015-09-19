package com.twu.baseline;

import java.util.ArrayList;

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
}
