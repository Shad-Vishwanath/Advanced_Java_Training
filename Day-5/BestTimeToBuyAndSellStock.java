class Solution {
    /*
     * Problem: 121. Best Time to Buy and Sell Stock
     * Platform: LeetCode
     * Topic: Array, Greedy
     *
     * Approach:
     * - Keep track of the minimum price seen so far
     * - For each price, calculate the profit if sold today
     * - Update the maximum profit whenever a better profit is found
     *
     * Time Complexity: O(n)
     * - Traverse the array once
     *
     * Space Complexity: O(1)
     * - Only a few variables are used
     */

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}
