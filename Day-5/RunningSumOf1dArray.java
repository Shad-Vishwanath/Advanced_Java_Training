class Solution {
    /*
     * Problem: 1480. Running Sum of 1d Array
     * Platform: LeetCode
     * Topic: Array, Prefix Sum
     *
     * Approach:
     * - Each element stores the sum of itself and all previous elements
     * - Update the array from left to right
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - The input array itself is reused
     */

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
