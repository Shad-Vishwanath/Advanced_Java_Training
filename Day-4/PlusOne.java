class Solution {
    /*
     * Problem: 66. Plus One
     * Platform: LeetCode
     * Topic: Arrays, Math
     *
     * Approach:
     * - Start from the last digit
     * - If the digit is less than 9, increase it by 1 and return
     * - If the digit is 9, make it 0 and continue carrying
     * - If all digits are 9, create a new array with one extra digit
     *
     * Time Complexity: O(n)
     * - In the worst case, all digits are traversed
     *
     * Space Complexity: O(1)
     * - Except for the output array in the all-9 case
     */

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
