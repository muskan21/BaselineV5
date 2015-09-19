package com.twu.baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseline {
    public String getInput(Scanner scanner) {
        Scanner read = scanner;
        return scanner.nextLine();
    }

    public ArrayList<String> getRowInput(Scanner scanner) {
        ArrayList<String> rowInput = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            rowInput.add(getInput(scanner));
        }
        return rowInput;
    }
}
