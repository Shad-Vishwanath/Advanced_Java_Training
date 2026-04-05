class Solution {
    /*
     * Problem: 2455. Average Value of Even Numbers That Are Divisible by Three
     * Platform: LeetCode
     * Topic: Array, Math
     *
     * Approach:
     * - Traverse the array
     * - Select numbers that are divisible by 2 and 3
     * - These are numbers divisible by 6
     * - Compute their sum and count
     * - Return sum / count, or 0 if no such number exists
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - Only sum and count variables are used
     */

    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }
}
