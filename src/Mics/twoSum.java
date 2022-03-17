import java.util.HashMap;

class twoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        twoSums(nums, target).toString();
    }

    static public int[] twoSums(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                System.out.println(i + "" + map.get(target - nums[i]));
                return new int[] { i, map.get(target - nums[i]) };
            } else {
                System.out.println("adding" + nums[i] + "at " + i);
                map.put(nums[i], i);
                System.out.println(map.toString());
            }

        }
        return new int[] {};
    }
}