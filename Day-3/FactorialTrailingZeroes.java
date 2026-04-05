class Solution {
    /*
     * Problem: 172. Factorial Trailing Zeroes
     * Platform: LeetCode
     * Topic: Math
     *
     * Approach:
     * - Trailing zeroes in n! are created by pairs of 2 and 5
     * - Since there are always more 2s than 5s in factorial multiplication,
     *   we only need to count how many times 5 appears as a factor
     * - Keep dividing n by 5 and add the quotient to the answer
     *
     * Example:
     * n = 25
     * 25 / 5 = 5
     * 25 / 25 = 1
     * Total = 5 + 1 = 6
     *
     * Time Complexity: O(log n)
     * - We keep dividing n by 5
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
