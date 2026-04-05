class Solution {
    /*
     * Problem: 191. Number of 1 Bits
     * Platform: LeetCode
     * Topic: Bit Manipulation
     *
     * Approach:
     * - Check the last bit using (n & 1)
     * - If it is 1, increase the count
     * - Right shift n to check the next bit
     * - Repeat until all 32 bits are checked
     *
     * Note:
     * - This problem is about counting the number of set bits (1s)
     *   in the binary representation of a number
     *
     * Time Complexity: O(32) -> O(1)
     * - Integer has fixed 32 bits
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1; // unsigned right shift
        }

        return count;
    }
}
