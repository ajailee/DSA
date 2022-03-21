package LeetCodeEasy;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    static public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (map.get(s.charAt(i)) < map.get((s.charAt(i + 1)))) {

                } else {
                    sum = sum + map.get(s.charAt(i));
                }
                System.out.println(sum);

            } else {
                if ((s.charAt(i) == 'V' || s.charAt(i) == 'X') && (s.charAt(i - 1) == 'I')) {
                    sum += (map.get(s.charAt(i)) - (map.get('I') * 2));

                } else if ((s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i - 1) == 'X') {

                    sum = sum + (map.get(s.charAt(i)) - (map.get('X') * 2));
                    System.out.println(sum);
                } else if ((s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i - 1) == 'C') {

                    sum = sum + (map.get(s.charAt(i)) - (map.get('C') * 2));
                    System.out.println(sum);
                } else {

                    sum = sum + map.get(s.charAt(i));
                    System.out.println(sum);
                }

            }

        }
        return sum;
    }

}
