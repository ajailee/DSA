package Recresion.Backtracking.Maze;

public class Maze1 {
    public static void main(String[] args) {
        int n = 3;
        int target = 9;
        find(n, target, 1, "");
        System.out.println("proFind");
        proFind(new Position(2, 2), new Position(0, 0), new Position(2, 2), "");
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

    static void proFind(Position maze, Position current, Position target, String processed) {
        if (current.i > maze.i || current.j > maze.j) {
            return;
        }
        if (target.equals(current)) {
            System.out.println(processed);
            return;
        }
        if (current.i < maze.i && current.j < maze.j) {
            proFind(maze, current.diagonally(), target, processed + "D");
        }
        if (current.i < maze.i) {
            proFind(maze, current.down(), target, processed + "V");
        }
        if (current.j < maze.j) {
            proFind(maze, current.right(), target, processed + "H");
        }
    }

}

class Position {
    int i;
    int j;

    Position(int i, int j) {
        this.i = i;
        this.j = j;
    }

    Position down() {
        int newi = this.i + 1;
        return new Position(newi, this.j);
    }

    Position right() {
        int newj = this.j + 1;
        return new Position(i, newj);
    }

    Position diagonally() {
        int newi = this.i + 1;
        int newj = this.j + 1;
        return new Position(newi, newj);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Position))
            return false;
        Position obj1 = (Position) obj;
        return (obj1.i == this.i && obj1.j == this.j);
    }

}
