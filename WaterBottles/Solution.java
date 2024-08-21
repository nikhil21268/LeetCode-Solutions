package WaterBottles;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int res = 0;
        int empty = 0;

        while(numBottles != 0){

            res += numBottles;
            System.out.println("drinking = " + numBottles);
            System.out.println("empty = " + empty);
            System.out.println();

            empty += numBottles;

            int recharge = empty / numExchange;
            empty = empty % numExchange;

            numBottles = recharge;

        }

        return res;

    }
}