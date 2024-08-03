package CoinChange;

import java.util.Arrays;

class Solution {
    int[] memory;
    public int minCoins(int[] coins, int amount, int recursionDepth) {
        // infinity <- implies we cannot generate the amount with the given coins
        if(amount < 0) return Integer.MAX_VALUE;
        else if(memory[amount] != Integer.MAX_VALUE) return memory[amount];
        else if (amount == 0){
            return recursionDepth;
        }
        for(int i:coins){
            memory[amount] = Math.min(memory[amount], minCoins(coins, amount - i, recursionDepth + 1));
        }
        return memory[amount];
    }
    public int coinChange(int[] coins, int amount) {
        memory = new int[amount + 1];
        Arrays.fill(memory, Integer.MAX_VALUE);
        int res = minCoins(coins, amount, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}