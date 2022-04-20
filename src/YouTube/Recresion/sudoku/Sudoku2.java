package Recresion.sudoku;

import java.util.Arrays;

public class Sudoku2 {
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
        if (solve(box)) {
            for (int[] b : box) {
                System.out.println(Arrays.toString(b));
            }
            System.out.println();
        }
    }

    static boolean solve(int[][] box) {
        int[] loc = isEmptyLeft(box);
        if (loc[0] == -1 || loc[1] == -1) {

            return true;
        }
        for (int i = 1; i < 10; i++) {
            if (check(box, loc[0], loc[1], i)) {
                box[loc[0]][loc[1]] = i;
                if (solve(box))
                    return true;
                box[loc[0]][loc[1]] = 0;
            }
        }
        return false;
    }

    static boolean check(int[][] box, int row, int column, int number) {
        for (int i = 0; i < box.length; i++) {
            if (box[i][column] == number) {
                return false;
            }
        }
        for (int i = 0; i < box[row].length; i++) {
            if (box[row][i] == number) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(row);
        int rowstart = row - row % 3;
        int columnstart = column - column % 3;
        for (int i = rowstart; i < rowstart + sqrt; i++) {
            for (int j = columnstart; j < columnstart + sqrt; j++) {
                if (box[row][i] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    static int[] isEmptyLeft(int[][] box) {
        int i = -1;
        int j = -1;

        for (int row = 0; row < box.length; row++) {
            for (int column = 0; column < box[row].length; column++) {
                if (box[row][column] == 0) {
                    i = row;
                    j = column;
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { i, j };
    }
}