class Solution {
    /*
     * Problem: 724. Find Pivot Index
     * Platform: LeetCode
     * Topic: Array, Prefix Sum
     *
     * Approach:
     * - Compute total sum of the array
     * - Traverse the array while maintaining left sum
     * - Pivot index is where:
     *   left sum == total sum - left sum - current element
     *
     * Time Complexity: O(n)
     * - One pass to calculate total, one pass to find pivot
     *
     * Space Complexity: O(1)
     * - Only sum variables are used
     */

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
