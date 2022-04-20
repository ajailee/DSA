package Recresion.sudoku;

import java.util.Arrays;

class Sudokucopy {
    public static void main(String[] args) {
        int[][] box = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 },
        };

        find(box, 0, 0);

    }

    static boolean finished(int[][] box) {
        for (int[] b : box) {
            for (int j : b) {
                if (j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static void find(int[][] box, int row, int column) {

        if (column > box.length - 1) {
            if (finished(box)) {
                for (int[] b : box) {
                    System.out.println(Arrays.toString(b));
                }
                System.out.println();
                return;
            }
            return;
        }
        if (row > box.length - 1) {
            find(box, 0, column + 1);
            return;
        }

        if (box[row][column] == 0) {
            for (int i = 1; i < 10; i++) {
                if (check(box, row, column, i)) {
                    box[row][column] = i;
                    find(box, row + 1, column);
                    box[row][column] = 0;
                }
            }
        } else {
            find(box, row + 1, column);
        }
    }

    static boolean check(int[][] box, int row, int column, int number) {

        int sqr = (int) Math.sqrt(row);
        int rowstart = row - row % 3;
        int columnstart = column - column % 3;

        for (int i = rowstart; i < rowstart + sqr; i++) {
            for (int j = columnstart; j < columnstart + sqr; j++) {
                if (number == box[i][j]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < box[row].length; i++) {
            if (number == box[row][i]) {
                return false;
            }
        }

        for (int i = 0; i < box.length; i++) {
            if (number == box[i][column]) {
                return false;
            }
        }
        return true;
    }
}