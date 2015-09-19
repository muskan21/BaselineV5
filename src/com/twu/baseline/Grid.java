package com.twu.baseline;

import java.util.ArrayList;

public class Grid {
    private ArrayList<ArrayList<String>> grid = new ArrayList<ArrayList<String>>();

    public Grid(ArrayList<ArrayList<String>> grid) {
        this.grid = grid;
    }

    public boolean compare(int cellPosition, int neighborPosition) {
        if("-".equals(grid.get(0).get(1)))
            return false;
        else if(cellPosition == 0 && neighborPosition == -1)
            return false;
        else if (cellPosition == 0 && neighborPosition == 2)
            return false;
        return true;
    }
}
