class Solution {
    /*
     * Problem: 390. Elimination Game
     * Platform: LeetCode
     * Topic: Math, Simulation
     *
     * Approach:
     * - Numbers are eliminated alternately from left to right and right to left
     * - Instead of simulating the full list, track:
     *   1. head -> current starting number
     *   2. step -> gap between remaining numbers
     *   3. remaining -> how many numbers are left
     *   4. leftToRight -> direction of elimination
     *
     * - The head changes:
     *   1. Always when eliminating from left to right
     *   2. When eliminating from right to left and remaining count is odd
     *
     * Time Complexity: O(log n)
     * - Remaining numbers are halved each round
     *
     * Space Complexity: O(1)
     * - Only a few variables are used
     */

    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean leftToRight = true;

        while (remaining > 1) {
            if (leftToRight || remaining % 2 == 1) {
                head += step;
            }

            remaining /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return head;
    }
}
