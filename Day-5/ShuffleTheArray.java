class Solution {
    /*
     * Problem: 1470. Shuffle the Array
     * Platform: LeetCode
     * Topic: Array
     *
     * Approach:
     * - Create a new array of size 2n
     * - Place elements alternately as:
     *   x1, y1, x2, y2, ...
     *
     * Time Complexity: O(n)
     * - Traverse half of the array
     *
     * Space Complexity: O(n)
     * - New result array is created
     */

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
