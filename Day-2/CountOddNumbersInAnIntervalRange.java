class Solution {
    /*
     * Problem: Count Odd Numbers in an Interval Range
     * Platform: LeetCode
     * Topic: Math
     *
     * Approach:
     * - Count how many odd numbers exist from 0 to high
     * - Count how many odd numbers exist from 0 to low - 1
     * - Subtract the two results to get the count of odd numbers in [low, high]
     *
     * Formula Used:
     * - Number of odd numbers from 0 to x is (x + 1) / 2
     *
     * Time Complexity: O(1)
     * - Uses direct arithmetic calculation
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public int countOdds(int low, int high) {
        // Count odd numbers from 0 to high
        int tillHigh = (high + 1) / 2;

        // Count odd numbers from 0 to low - 1
        int tillLow = low / 2;

        // Odd numbers in range [low, high]
        return tillHigh - tillLow;
    }
}
