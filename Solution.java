import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i] == target)
                return new int[]{i,i};
        }
        return new int[]{};
    }
    public static void main(String[] args) {
            Solution soln = new Solution();
            int[] nums = new int[1];
            nums[0] = 1;
            int target = 2;
            int[] result = soln.twoSum(nums, target);
            System.out.println(Arrays.toString(result));
    }
}

/**
 * Method: 1
 * ---------
 * 
 */