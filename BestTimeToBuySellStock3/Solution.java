package BestTimeToBuySellStock3;

class Solution {
    public int maxProfit(int[] prices) {

        int costAfterFirstBuy = Integer.MIN_VALUE;
        int profitAfterFirstSell = 0;
        int costAfterSecondBuy = Integer.MIN_VALUE;
        int profitAfterSecondSell = 0;

        for(int price: prices){

            costAfterFirstBuy = Math.max(costAfterFirstBuy, -price);
            profitAfterFirstSell = Math.max(profitAfterFirstSell, costAfterFirstBuy + price);
            costAfterSecondBuy = Math.max(costAfterSecondBuy, profitAfterFirstSell - price);
            profitAfterSecondSell = Math.max(profitAfterSecondSell, costAfterSecondBuy + price);

        }

        return Math.max(profitAfterFirstSell, profitAfterSecondSell);

    }
}