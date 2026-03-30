class Solution {
    /*
     * Problem: 1025. Divisor Game
     * Platform: LeetCode
     * Topic: Math, Game Theory
     *
     * Approach:
     * - If n is even, the first player can always force a win
     * - If n is odd, the first player will lose if the second player plays optimally
     *
     * Key Observation:
     * - Choosing a divisor from an even number can make the opponent face an odd number
     * - From an odd number, every valid move leads to an even number
     * - This pattern continues, making even numbers winning states
     *
     * Time Complexity: O(1)
     * - Only one modulo check is performed
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public boolean divisorGame(int n) {
        // First player wins only when n is even
        return n % 2 == 0;
    }
}
