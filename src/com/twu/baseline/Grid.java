package com.twu.baseline;

import java.util.ArrayList;

public class Grid {
    private ArrayList<ArrayList<String>> grid = new ArrayList<ArrayList<String>>();

    public Grid(ArrayList<ArrayList<String>> grid) {
        this.grid = grid;
    }

    public int countAliveNeighbors(int cellRowPosition, int cellColumnPosition) {
        int count = 0;
        if("X".equals(grid.get(cellRowPosition).get(cellColumnPosition + 1)))
            count++;
        if("X".equals(grid.get(cellRowPosition + 1).get(cellColumnPosition)))
            count++;
        if(cellColumnPosition != 0 && "X".equals(grid.get(cellRowPosition).get(cellColumnPosition - 1)))
            count++;
        if(cellRowPosition != 0 && "X".equals(grid.get(cellRowPosition - 1).get(cellColumnPosition)))
            count++;
        return count;
    }
}
