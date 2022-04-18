package Recresion.Backtracking.knight;

import java.util.Arrays;

public class Knight {
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        board[0][0] = 'k';
        int res = find(board, 0, 0, 13);
        System.out.println(res);

    }

    static int find(char[][] board, int row, int column, int count) {
        int res = 0;
        if (count == 0) {
            for (char[] c : board) {
                System.out.println(Arrays.toString(c));
            }
            System.out.println("");
            return 1;
        }
        if (row > board.length - 1) {
            res = res + find(board, 0, column + 1, count);
            return res;
        }
        if (column > board[0].length - 1) {
            return 0;
        }
        if (check(board, row, column)) {
            board[row][column] = 'k';
            res = res + find(board, row + 1, column, count - 1);
            board[row][column] = ' ';
        }
        res = res + find(board, row + 1, column, count);
        return res;
    }

    static boolean check(char[][] board, int row, int column) {
        return Lrightup(board, row, column) && SLrightup(board, row, column) &&
                Lleftup(board, row, column) && SLleftup(board, row, column) &&
                Lrightdown(board, row, column) && SLrightdown(board, row, column) &&
                Lleftdown(board, row, column) && SLleftdown(board, row, column);

    }

    static boolean Lrightup(char[][] board, int row, int column) {
        if (row - 2 >= 0 && column + 1 <= board[0].length - 1) {
            if (board[row - 2][column + 1] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean SLrightup(char[][] board, int row, int column) {
        if (row - 1 >= 0 && column + 2 < board[0].length) {
            if (board[row - 1][column + 2] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean Lleftup(char[][] board, int row, int column) {
        if (row - 2 >= 0 && column - 1 >= 0) {
            if (board[row - 2][column - 1] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean SLleftup(char[][] board, int row, int column) {
        if (row - 1 >= 0 && column - 2 >= 0) {
            if (board[row - 1][column - 2] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean Lrightdown(char[][] board, int row, int column) {
        if (row + 2 < board.length && column + 1 < board[0].length) {
            if (board[row + 2][column + 1] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean SLrightdown(char[][] board, int row, int column) {
        if (row + 1 < board.length && column + 2 < board[0].length) {
            if (board[row + 1][column + 2] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean Lleftdown(char[][] board, int row, int column) {
        if (row + 2 < board.length && column - 1 >= 0) {
            if (board[row + 2][column - 1] == 'k') {
                return false;
            }
        }
        return true;
    }

    static boolean SLleftdown(char[][] board, int row, int column) {
        if (row + 1 < board.length && column - 2 >= 0) {
            if (board[row + 1][column - 2] == 'k') {
                return false;
            }
        }
        return true;
    }
}