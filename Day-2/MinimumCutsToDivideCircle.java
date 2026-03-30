class Solution {
    /*
     * Problem: Minimum Cuts to Divide a Circle
     * Platform: LeetCode
     * Topic: Math
     *
     * Approach:
     * - If n is 1, no cut is needed because the circle already has one piece
     * - If n is even, one straight cut can divide the circle into 2 equal parts,
     *   so n / 2 cuts are enough
     * - If n is odd and greater than 1, each cut can create only one new equal part,
     *   so n cuts are needed
     *
     * Time Complexity: O(1)
     * - Only a few conditional checks are performed
     *
     * Space Complexity: O(1)
     * - No extra space is used
     */

    public int numberOfCuts(int n) {
        // If only one piece is needed, no cuts are required
        if (n == 1) {
            return 0;
        }

        // If n is even, n / 2 cuts are enough
        if (n % 2 == 0) {
            return n / 2;
        }

        // If n is odd and greater than 1, n cuts are required
        return n;
    }
}
