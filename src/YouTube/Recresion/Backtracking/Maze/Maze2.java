package Recresion.Backtracking.Maze;

import java.util.ArrayList;
import java.util.List;

public class Maze2 {
    public static void main(String[] args) {

        Position2 maze = new Position2(2, 2);
        Position2 target = new Position2(2, 2);
        Position2 current = new Position2(0, 0);
        Position2 obstacle = new Position2(1, 1);
        Position2 obstacle1 = new Position2(0, 1);
        List<Position2> obstracleList = new ArrayList<>();
        obstracleList.add(obstacle);
        obstracleList.add(obstacle1);
        find(maze, current, target, "", obstracleList);

    }

    static void find(Position2 maze, Position2 current, Position2 target, String processed, List<Position2> obstacle) {
        if (current.i > maze.i || current.j > maze.j) {
            return;
        }
        if (current.equals(target)) {
            System.out.println(processed);
            return;
        }
        if (current.i < maze.i && (!obstacle.contains(current.down()))) {
            Position2 newc = current.down();
            find(maze, newc, target, processed + "D", obstacle);
        }
        if (current.j < maze.j && (!obstacle.contains(current.right()))) {
            find(maze, current.right(), target, processed + "R", obstacle);
        }
        if (current.j < maze.j && current.i < maze.i && (!obstacle.contains(current.diagonally()))) {
            find(maze, current.diagonally(), target, processed + "d", obstacle);
        }
    }
}

class Position2 {
    int i;
    int j;

    Position2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    Position2 down() {
        int newi = this.i + 1;
        return new Position2(newi, this.j);
    }

    Position2 right() {
        int newj = this.j + 1;
        return new Position2(this.i, newj);
    }

    Position2 diagonally() {
        int newi = this.i + 1;
        int newj = this.j + 1;
        return new Position2(newi, newj);
    }

    @Override
    public boolean equals(Object obj) {
        Position2 p = (Position2) obj;
        return (p.i == this.i && p.j == this.j);
    }
}
