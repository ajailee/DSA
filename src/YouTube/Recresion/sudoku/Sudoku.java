package Recresion.sudoku;

import java.util.Arrays;

class Sudoku {
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
        try {
            find(box);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static int[] getEmpty(int[][] box) {
        int i = -1;
        int j = -1;
        for (int k = 0; k < box.length; k++) {
            for (int l = 0; l < box[k].length; l++) {
                if (box[k][l] == 0) {
                    i = k;
                    j = l;
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { i, j };
    }

    static void find(int[][] box) {
        int[] loc = getEmpty(box);
        if (loc[0] == -1 || loc[1] == -1) {
            for (int[] i : box) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (check(box, loc[0], loc[1], i)) {
                box[loc[0]][loc[1]] = i;
                find(box);
                box[loc[0]][loc[1]] = 0;
            }

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