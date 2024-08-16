package BestTimeToBuySellStock4;

class Solution {
    public int maxProfit(int k, int[] prices) {

        int costAfterFirstBuy = Integer.MAX_VALUE;
        int profitAfterFirstSell = 0;

        for(int price: prices){

            int kCopy = k;
            while (kCopy != 0){

                if(kCopy == k){
                    costAfterFirstBuy = Math.min(costAfterFirstBuy, price);
                    profitAfterFirstSell = Math.max(profitAfterFirstSell, -costAfterFirstBuy + price);
                }
                else{
                    costAfterFirstBuy = Math.min(costAfterFirstBuy, price - profitAfterFirstSell);
                    profitAfterFirstSell = Math.max(profitAfterFirstSell, -costAfterFirstBuy + price);
                }

                kCopy--;
            }

            System.out.println(costAfterFirstBuy);
            System.out.println(profitAfterFirstSell);
            System.out.println();
        }

        return profitAfterFirstSell;

    }
}