import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
     * Problem: 1. Two Sum
     * Platform: LeetCode
     * Topic: Array, Hashing
     *
     * Approach:
     * - Use a HashMap to store each number and its index
     * - For each element, check whether target - current element already exists
     * - If yes, return the two indices
     *
     * Time Complexity: O(n)
     * - Each lookup and insertion in HashMap is O(1) on average
     *
     * Space Complexity: O(n)
     * - HashMap stores array elements
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
