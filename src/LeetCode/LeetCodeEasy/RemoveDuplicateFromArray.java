package LeetCodeEasy;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 3, 3, 4, 5 };
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (i == nums.length)
                return count;
            if (nums[i - 1] == nums[i]) {
                nums[i] = nums[i + 1];
                count++;
            }
        }
        return count;
    }
}
