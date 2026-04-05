class Solution {
    /*
     * Problem: 1217. Minimum Cost to Move Chips to The Same Position
     * Platform: LeetCode
     * Topic: Array, Greedy, Math
     *
     * Approach:
     * - Moving a chip by 2 positions costs 0
     * - Moving a chip by 1 position costs 1
     * - So, all chips on even positions can be moved together for free
     * - All chips on odd positions can also be moved together for free
     * - The minimum cost is the smaller count between chips on even positions and odd positions
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - Only two counters are used
     */

    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }
}
