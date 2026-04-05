class Solution {
    /*
     * Problem: 319. Bulb Switcher
     * Platform: LeetCode
     * Topic: Math
     *
     * Approach:
     * - A bulb ends up ON only if it is toggled odd number of times
     * - Bulb i is toggled once for every divisor of i
     * - Most numbers have divisors in pairs, so they are toggled even number of times
     * - Perfect squares have one unpaired divisor, so they are toggled odd number of times
     *
     * Therefore:
     * - Count how many perfect squares are <= n
     * - That count is the answer
     *
     * Time Complexity: O(1)
     * - Uses square root directly
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
