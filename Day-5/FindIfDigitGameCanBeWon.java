class Solution {
    /*
     * Problem: 3232. Find if Digit Game Can Be Won
     * Platform: LeetCode
     * Topic: Array, Math
     *
     * Approach:
     * - Split the numbers into:
     *   1. single-digit numbers
     *   2. double-digit numbers
     * - Calculate the sum of each group
     * - Alice wins if the sums are not equal
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - Only two sum variables are used
     */

    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        return singleDigitSum != doubleDigitSum;
    }
}
