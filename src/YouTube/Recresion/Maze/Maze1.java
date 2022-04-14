package Recresion.Maze;

public class Maze1 {
    public static void main(String[] args) {
        int n = 3;
        int target = 9;
        find(n, target, 1, "");
    }

    static void find(int n, int target, int i, String processed) {
        if (i > n * n) {
            return;
        }
        if (i == target) {
            System.out.println(processed);
            return;
        }
        if (i % n != 0 || i == 1) {
            find(n, target, i + 1, processed + "R");
        }
        if (!(i < n * n && i > ((n * n) - n))) {
            find(n, target, i + n, processed + "D");
        }
    }

}
