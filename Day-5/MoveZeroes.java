class Solution {
    /*
     * Problem: 283. Move Zeroes
     * Platform: LeetCode
     * Topic: Array, Two Pointers
     *
     * Approach:
     * - Use a pointer to place non-zero elements in front
     * - Traverse the array and copy non-zero elements forward
     * - Fill remaining positions with zeroes
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - In-place modification is done
     */

    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
