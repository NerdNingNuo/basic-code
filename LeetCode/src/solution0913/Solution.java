package solution0913;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

    }
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; ++i) nums[i] += nums[i - 1];
        return nums;
    }
}
