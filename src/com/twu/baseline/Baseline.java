package com.twu.baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseline {
    ConsoleInput consoleInput;

    public Baseline(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public ArrayList<String> getRowInput() {
        ArrayList<String> rowInput = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            rowInput.add(consoleInput.getInput());
        }
        return rowInput;
    }
}
