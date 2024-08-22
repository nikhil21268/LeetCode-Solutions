package AmountPaidInTaxes;

import java.util.HashMap;

class Solution {
    public double calculateTax(int[][] brackets, int income) {

        double res = 0;

        for(int[] row: brackets){

            System.out.println("income = " + income);

            int upperI = row[0];
            int percentI = row[1];

            if(income >= upperI){
                income -= upperI;
                res += percentI * upperI * 0.01;
                System.out.println("current Tax = " + res);
                System.out.println();
            }

            else break;

        }

        return res;

    }
}