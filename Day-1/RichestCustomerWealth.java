class Solution {
    /*
     * Problem: Richest Customer Wealth
     * Platform: LeetCode
     * Topic: Arrays, 2D Arrays
     *
     * Approach:
     * - Traverse each customer (each row in the 2D array)
     * - Calculate the total wealth of that customer by summing all accounts
     * - Keep track of the maximum wealth found
     *
     * Time Complexity: O(m * n)
     * - m = number of customers
     * - n = number of accounts per customer
     * - We visit each element in the matrix exactly once
     *
     * Space Complexity: O(1)
     * - Only a few extra variables are used
     */

    public int maximumWealth(int[][] accounts) {
        // Stores the maximum wealth found among all customers
        int maxWealth = 0;

        // Loop through each customer
        for (int i = 0; i < accounts.length; i++) {
            // Stores the total wealth of the current customer
            int currentWealth = 0;

            // Add all account balances of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            // Update maxWealth if current customer has more wealth
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        // Return the richest customer's wealth
        return maxWealth;
    }
}
