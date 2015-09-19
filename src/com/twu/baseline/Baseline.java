package com.twu.baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseline {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public ArrayList<String> getRowInput() {
        ArrayList<String> rowInput = new ArrayList<String>();
        rowInput.add("X");
        rowInput.add("X");
        rowInput.add("-");
        return rowInput;
    }
}
