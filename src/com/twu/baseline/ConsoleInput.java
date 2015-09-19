//Reads The Console Input From The User And Returns It As A String.
package com.twu.baseline;

import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
