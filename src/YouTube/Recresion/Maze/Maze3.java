package Recresion.Maze;

import java.util.ArrayList;
import java.util.List;

public class Maze3 {
    public static void main(String[] args) {

        Position3 maze = new Position3(2, 2);
        Position3 target = new Position3(2, 2);
        Position3 current = new Position3(0, 0);
        List<Position3> obstracleList = new ArrayList<>();
        int[][] matrix = { { 0, 0, 0, }, { 0, 0, 0 }, { 0, 0, 0 } };
        // find(maze, current, target, "", obstracleList);
        find2(maze, current, target, "", obstracleList, matrix, 1);

    }

    static void find(Position3 maze, Position3 current, Position3 target, String processed, List<Position3> obstacle) {
        if (current.i > maze.i || current.j > maze.j) {
            return;
        }
        if (current.equals(target)) {
            System.out.println(processed);
            return;
        }
        if (current.i > 0 && (!obstacle.contains(current.up()))) {
            obstacle.add(current);
            find(maze, current.up(), target, processed + "U", obstacle);
            obstacle.remove(current);
        }
        if (current.j > 0 && (!obstacle.contains(current.left()))) {
            obstacle.add(current);
            find(maze, current.left(), target, processed + "L", obstacle);
            obstacle.remove(current);
        }
        if (current.i < maze.i && (!obstacle.contains(current.down()))) {
            obstacle.add(current);
            find(maze, current.down(), target, processed + "D", obstacle);
            obstacle.remove(current);
        }
        if (current.j < maze.j && (!obstacle.contains(current.right()))) {
            obstacle.add(current);
            find(maze, current.right(), target, processed + "R", obstacle);
            obstacle.remove(current);
        }

    }

    static void find2(Position3 maze, Position3 current, Position3 target, String processed, List<Position3> obstacle,
            int[][] matrix, int step) {
        if (current.i > maze.i || current.j > maze.j) {
            return;
        }
        if (current.equals(target)) {
            matrix[current.i][current.j] = step;
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println(processed);
            matrix[current.i][current.j] = 0;
            return;
        }
        if (current.i > 0 && (!obstacle.contains(current.up()))) {
            obstacle.add(current);
            matrix[current.i][current.j] = step;
            find2(maze, current.up(), target, processed + "U", obstacle, matrix, step + 1);
            obstacle.remove(current);
            matrix[current.i][current.j] = 0;

        }
        if (current.j > 0 && (!obstacle.contains(current.left()))) {
            obstacle.add(current);
            matrix[current.i][current.j] = step;
            find2(maze, current.left(), target, processed + "L", obstacle, matrix, step + 1);
            obstacle.remove(current);
            matrix[current.i][current.j] = 0;
        }
        if (current.i < maze.i && (!obstacle.contains(current.down()))) {
            obstacle.add(current);
            matrix[current.i][current.j] = step;
            find2(maze, current.down(), target, processed + "D", obstacle, matrix, step + 1);
            obstacle.remove(current);
            matrix[current.i][current.j] = 0;
        }
        if (current.j < maze.j && (!obstacle.contains(current.right()))) {
            obstacle.add(current);
            matrix[current.i][current.j] = step;
            find2(maze, current.right(), target, processed + "R", obstacle, matrix, step + 1);
            obstacle.remove(current);
            matrix[current.i][current.j] = 0;
        }

    }
}

class Position3 {
    int i;
    int j;

    Position3(int i, int j) {
        this.i = i;
        this.j = j;
    }

    Position3 down() {
        int newi = this.i + 1;
        return new Position3(newi, this.j);
    }

    Position3 right() {
        int newj = this.j + 1;
        return new Position3(this.i, newj);
    }

    Position3 up() {
        int newi = this.i - 1;
        return new Position3(newi, this.j);
    }

    Position3 left() {
        int newj = this.j - 1;
        return new Position3(this.i, newj);
    }

    @Override
    public boolean equals(Object obj) {
        Position3 p = (Position3) obj;
        return (p.i == this.i && p.j == this.j);
    }
}
