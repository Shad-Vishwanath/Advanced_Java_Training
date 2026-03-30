class Solution {
    /*
     * Problem: Count of Matches in Tournament
     * Platform: LeetCode
     * Topic: Math, Simulation
     *
     * Approach:
     * - In every match, exactly one team gets eliminated
     * - To decide one final winner, n - 1 teams must be eliminated
     * - Therefore, total matches played will always be n - 1
     *
     * Time Complexity: O(1)
     * - The answer is computed directly
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public int numberOfMatches(int n) {
        // Total matches needed to eliminate n - 1 teams
        return n - 1;
    }
}
