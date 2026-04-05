class Solution {
    /*
     * Problem: 27. Remove Element
     * Platform: LeetCode
     * Topic: Array, Two Pointers
     *
     * Approach:
     * - Use a pointer to track the position where the next valid element should go
     * - Traverse the array
     * - If the current element is not equal to val, place it at the pointer position
     * - Return the count of valid elements
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - In-place modification is done
     */

    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int num : nums) {
            if (num != val) {
                nums[index] = num;
                index++;
            }
        }

        return index;
    }
}
