class Solution {
    /*
     * Problem: Nim Game
     * Platform: LeetCode
     * Topic: Math, Game Theory
     *
     * Approach:
     * - In the Nim Game, two players take turns removing 1 to 3 stones
     * - The player who removes the last stone wins
     * - If the number of stones is a multiple of 4, the first player will lose
     *   if the second player plays optimally
     * - This is because no matter whether the first player removes 1, 2, or 3 stones,
     *   the second player can always remove enough stones to make the total removed in
     *   that round equal to 4
     *
     * Key Observation:
     * - If n % 4 == 0, return false
     * - Otherwise, return true
     *
     * Time Complexity: O(1)
     * - Only one modulo operation is performed
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public boolean canWinNim(int n) {
        // If n is divisible by 4, the first player cannot win
        return n % 4 != 0;
    }
}
