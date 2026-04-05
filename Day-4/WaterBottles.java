class Solution {
    /*
     * Problem: 1518. Water Bottles
     * Platform: LeetCode
     * Topic: Math, Simulation
     *
     * Approach:
     * - Drink all full bottles first
     * - Empty bottles can be exchanged for new full bottles
     * - Repeat until fewer empty bottles remain than required for exchange
     *
     * Time Complexity: O(log n) in practice
     * - Number of bottles decreases over exchanges
     *
     * Space Complexity: O(1)
     * - No extra data structure is used
     */

    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {
            totalDrunk += numBottles;
            emptyBottles += numBottles;

            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }

        return totalDrunk;
    }
}
