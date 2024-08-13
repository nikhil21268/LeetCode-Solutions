package CoinChange;

import java.util.Arrays;

class Solution {

    int res = Integer.MAX_VALUE;

    public void dfs(int[] coins, int amount, int coinsChosen){

        if(coinsChosen > res) return;

        if(amount < 0) return;

        if(amount == 0) {
            res = Math.min(res, coinsChosen);
            return;
        }

        for (int i: coins) {

            if(amount % i == 0) {
                res = Math.min(res, coinsChosen + (amount / i));
                continue;
            }

            dfs(coins, amount - i, coinsChosen + 1);

        }
    }

    public int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);

        int[] newCoins = new int[coins.length];

        int idx = 0;
        for (int i = coins.length-1; i >= 0; i--) {

            newCoins[idx] = coins[i];
            idx++;
        }

        dfs(newCoins, amount, 0);

        return res != Integer.MAX_VALUE ? res : -1;
    }
}