class Solution {
    /*
     * Problem: 169. Majority Element
     * Platform: LeetCode
     * Topic: Array, Boyer-Moore Voting Algorithm
     *
     * Approach:
     * - Maintain a candidate and a count
     * - If count becomes 0, choose the current element as candidate
     * - If current element matches candidate, increase count
     * - Otherwise, decrease count
     * - The remaining candidate is the majority element
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - No extra data structure is used
     */

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
