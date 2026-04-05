class Solution {
    /*
     * Problem: 397. Integer Replacement
     * Platform: LeetCode
     * Topic: Math, Recursion, Bit Manipulation
     *
     * Approach:
     * - If n is even, divide it by 2
     * - If n is odd:
     *   1. Either add 1
     *   2. Or subtract 1
     * - Choose the option that leads to fewer operations
     *
     * Important Edge Case:
     * - Use long instead of int to safely handle Integer.MAX_VALUE
     *
     * Time Complexity: O(log n)
     * - Number reduces significantly in each step
     *
     * Space Complexity: O(1)
     * - Iterative approach uses constant extra space
     */

    public int integerReplacement(int n) {
        long num = n;
        int steps = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if (num == 3 || num % 4 == 1) {
                    num--;
                } else {
                    num++;
                }
            }
            steps++;
        }

        return steps;
    }
}
