package LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//66. Plus One
public class AddPlusOne {
    public static void main(String[] args) {
        // int[] digits = new int[] { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8,
        // 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9,
        // 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6 };
        int[] digits = new int[] { 9, 9 };
        int[] res = plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int back = 2;
        if (digits[digits.length - 1] == 9) {
            digits[digits.length - 1] = 0;
            while (back <= digits.length && (digits[digits.length - back] + 1) > 9) {
                if (back == digits.length) {
                    digits[0] = 1;
                    for (int i = 1; i < digits.length; i++) {
                        digits[i] = 0;
                    }
                }
                digits[digits.length - back] = 0;
                back++;
            }
            if (back > digits.length) {
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                for (int i = 1; i < res.length; i++) {
                    res[i] = 0;
                }
                return res;
            } else {
                digits[digits.length - back] = digits[digits.length - back] + 1;
            }

        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }
        return digits;
    }
}