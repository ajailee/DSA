package Recresion.SubSet;

public class SumSubset {
    public static void main(String[] args) {
        int[] number = { 2, 3, 6, 7 };
        int target = 7;
        find("", number, target);
    }

    private static void find(String p, int[] number, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int n : number) {

            if (target == 0) {
                break;
            }
            if (n <= target) {
                target = target - n;
                p = p + n;
                find(p, number, target);
            }
        }
    }
}
