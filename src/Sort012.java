import java.util.ArrayList;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        // using my method
        for (int i : arr) {
            if (i == 0) {
                list.add(i);
            }
        }

        for (int i : arr) {
            if (i == 1) {
                list.add(i);
            }
        }

        for (int i : arr) {
            if (i == 2) {
                list.add(i);
            }
        }
        System.out.println(list.toString());
    }
}
