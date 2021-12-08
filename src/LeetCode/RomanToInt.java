package LeetCode;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "LVIII";
        HashMap map = new HashMap<String, Integer>();
        char[] c = s.toCharArray();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            int num = (int) map.get(c[i] + "");
            if (i > 0) {
                if ((c[i] == 'V' || c[i] == 'X') && c[i - 1] == 'I') {
                    System.out.println(sum);
                    sum = sum - num;
                    System.out.println(sum);
                }
                if ((c[i] == 'L' || c[i] == 'C') && c[i - 1] == 'X') {
                    sum = sum - num;
                }
                if ((c[i] == 'D' || c[i] == 'M') && c[i - 1] == 'C') {
                    sum = sum - num;
                }
            } else {
                sum = sum + num;
            }

            // sum = sum + num;

            System.out.println(Math.abs(sum));
        }
    }

}
