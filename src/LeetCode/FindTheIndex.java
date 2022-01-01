package LeetCode;

import java.util.Arrays;

public class FindTheIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int mid = nums.length / 2;
        if (nums[mid] == target)
            return mid;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (nums[mid] > target) {
            for (int i = 0; i <= mid; i++) {
                if (nums[i] == target) {
                    return i;
                } else if (target < nums[i]) {
                    return i;
                }

                else if (nums[i] <= target && target <= nums[i + 1]) {
                    return i + 1;
                }
            }
        } else {
            for (int i = mid; i < nums.length - 1; i++) {
                if (nums[i] == target) {
                    return i;
                } else if (target > nums[nums.length - 1]) {
                    return nums.length;
                } else if (nums[i] <= target && target <= nums[i + 1]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

}
