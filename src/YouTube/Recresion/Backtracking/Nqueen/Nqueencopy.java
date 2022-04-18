package Recresion.Backtracking.Nqueen;

import java.util.Arrays;

public class Nqueencopy {
    public static void main(String[] args) {
        int n = 8;
        char[][] board = new char[n][n];
        try {
            int res = find(board, 0, 0, 0);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static int find(char[][] board, int count, int row, int column) {
        int res = 0;
        if (count == board.length) {
            for (char[] c : board) {
                System.out.println(Arrays.toString(c));
            }
            System.out.println("");
            return 1;
        }
        if (row > board.length - 1 || column > board.length - 1) {
            return 0;
        }

        if (check(board, row, column)) {
            board[row][column] = 'q';
            res = res + find(board, count + 1, 0, column + 1);
            board[row][column] = ' ';
        }
        res = res + find(board, count, row + 1, column);
        return res;
    }

    static boolean check(char[][] board, int row, int column) {
        for (char c : board[row]) {
            if (c == 'q') {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'q') {
                return false;
            }
        }
        int temprow = row;
        int tempcolumn = column;
        while (temprow < board.length && tempcolumn < board[0].length) {
            if (board[temprow][tempcolumn] == 'q') {
                return false;
            }
            temprow++;
            tempcolumn++;
        }
        temprow = row;
        tempcolumn = column;
        while (temprow >= 0 && tempcolumn >= 0) {
            if (board[temprow][tempcolumn] == 'q') {
                return false;
            }
            temprow--;
            tempcolumn--;
        }
        temprow = row;
        tempcolumn = column;
        while (temprow < board.length && tempcolumn >= 0) {
            if (board[temprow][tempcolumn] == 'q') {
                return false;
            }
            temprow++;
            tempcolumn--;
        }
        temprow = row;
        tempcolumn = column;
        while (temprow >= 0 && tempcolumn < board[0].length) {
            if (board[temprow][tempcolumn] == 'q') {
                return false;
            }
            temprow--;
            tempcolumn++;
        }
        return true;
    }

}
