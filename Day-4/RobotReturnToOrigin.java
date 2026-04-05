class Solution {
    /*
     * Problem: 657. Robot Return to Origin
     * Platform: LeetCode
     * Topic: String, Simulation
     *
     * Approach:
     * - Track vertical and horizontal movement
     * - 'U' increases y
     * - 'D' decreases y
     * - 'R' increases x
     * - 'L' decreases x
     * - If both x and y become 0 at the end, robot returns to origin
     *
     * Time Complexity: O(n)
     * - Traverse each move once
     *
     * Space Complexity: O(1)
     * - Only two counters are used
     */

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            }
        }

        return x == 0 && y == 0;
    }
}
