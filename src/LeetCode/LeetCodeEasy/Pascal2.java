package LeetCodeEasy;

import java.util.ArrayList;
import java.util.List;

public class Pascal2 {
    public static void main(String[] args) {
        int row = 5;
        List<Integer> list = new ArrayList<Integer>();
        int mid = row / 2;
        System.out.println(mid);
        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == row) {
                list.add(1);
            } else {
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
