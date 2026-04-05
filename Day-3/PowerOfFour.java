class Solution {
    /*
     * Problem: 342. Power of Four
     * Platform: LeetCode
     * Topic: Math, Bit Manipulation, Recursion
     *
     * Approach:
     * - A number is a power of 4 if:
     *   1. It is greater than 0
     *   2. It can be divided by 4 repeatedly until it becomes 1
     * - If at any point it is not divisible by 4, return false
     *
     * Time Complexity: O(log n)
     * - In each step, n is divided by 4
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
