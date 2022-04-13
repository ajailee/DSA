package Recresion.SubSet;

public class Dice {
    public static void main(String[] args) {
        int target = 4;
        find("", target);
    }

    static void find(String res, int target) {
        if (target == 0) {
            System.out.println(res);
            return;
        }
        for (int i = 1; i <= target && i <= 6; i++) {
            find(res + i, target - i);
        }

    }
}
