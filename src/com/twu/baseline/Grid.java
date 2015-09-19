package com.twu.baseline;

import java.util.ArrayList;

public class Grid {
    private ArrayList<ArrayList<String>> grid = new ArrayList<ArrayList<String>>();

    public Grid(ArrayList<ArrayList<String>> grid) {
        this.grid = grid;
    }

    public boolean compare(int cellPosition, String neighborPosition) {
        if("-".equals(grid.get(0).get(1)) && "right".equals(neighborPosition))
            return false;
        else if("left".equals(neighborPosition))
            return false;
        else if ("up".equals(neighborPosition))
            return false;
        else if ("-".equals(grid.get(1).get(0)) && "down".equals(neighborPosition))
            return false;
        else if ("-".equals(grid.get(1).get(1)))
            return false;
        else if ("upright".equals(neighborPosition))
            return false;
        else if ("upleft".equals(neighborPosition))
            return false;
        else if ("downleft".equals(neighborPosition))
            return false;
        return true;
    }
}
