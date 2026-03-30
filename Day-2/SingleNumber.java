class Solution {
    /*
     * Problem: Single Number
     * Platform: LeetCode
     * Topic: Arrays, Bit Manipulation
     *
     * Approach:
     * - Every element appears twice except one
     * - XOR of a number with itself is 0
     * - XOR of a number with 0 is the number itself
     * - So, when all elements are XORed together, duplicate values cancel out
     *   and only the single number remains
     *
     * Example:
     * - 2 ^ 2 = 0
     * - 4 ^ 0 = 4
     *
     * Time Complexity: O(n)
     * - We traverse the array once
     *
     * Space Complexity: O(1)
     * - No extra data structure is used
     */

    public int singleNumber(int[] nums) {
        // Start with the first element
        int single = nums[0];

        // XOR all remaining elements
        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];
        }

        // The remaining value is the single number
        return single;
    }
}
