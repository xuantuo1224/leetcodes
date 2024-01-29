package com.xuantuo.top150;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        int cols = grid[0].length;
        if (cols == 0) {
            return 0;
        }

        int total = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if ('1' == grid[r][c]) {
                    total++;
                    remove(grid, r, c);
                }
            }
        }
        return total;

    }

    private static void remove(char[][] grid, int row, int col) {
        grid[row][col] = '0';
        if (col > 0 && grid[row][col - 1] == '1') {
            remove(grid, row, col - 1);
        }

        if (col < grid[0].length - 1 && grid[row][col + 1] == '1') {
            remove(grid, row, col + 1);
        }

        if (row > 0 && grid[row - 1][col] == '1') {
            remove(grid, row - 1, col);
        }

        if (row < grid.length - 1 && grid[row + 1][col] == '1') {
            remove(grid, row + 1, col);
        }

    }

}
