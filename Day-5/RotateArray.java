class Solution {
    /*
     * Problem: 189. Rotate Array
     * Platform: LeetCode
     * Topic: Array, Two Pointers
     *
     * Approach:
     * - Rotation can be done using reversal:
     *   1. Reverse the entire array
     *   2. Reverse the first k elements
     *   3. Reverse the remaining elements
     *
     * Time Complexity: O(n)
     * - Array is traversed a constant number of times
     *
     * Space Complexity: O(1)
     * - In-place reversal is used
     */

    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
