class Solution {
    /*
     * Problem: 400. Nth Digit
     * Platform: LeetCode
     * Topic: Math
     *
     * Approach:
     * - Digits appear in groups:
     *   1-digit numbers: 1 to 9   -> 9 numbers
     *   2-digit numbers: 10 to 99 -> 90 numbers
     *   3-digit numbers: 100 to 999 -> 900 numbers
     *
     * - First, find which digit-length group contains the nth digit
     * - Then find the exact number in that group
     * - Finally, extract the required digit from that number
     *
     * Time Complexity: O(log n)
     * - We move through digit groups
     *
     * Space Complexity: O(1)
     * - Only a few extra variables are used
     */

    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        // Find the group where the nth digit lies
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number containing the nth digit
        start += (n - 1) / digitLength;

        // Convert number to string and extract the digit
        String number = Long.toString(start);
        return number.charAt((n - 1) % (int) digitLength) - '0';
    }
}
