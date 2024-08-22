package LemonadeChange;

class Solution {
    public boolean lemonadeChange(int[] bills) {

        boolean res = true;

        int fiveBills = 0;
        int tenBills = 0;

        for(int i: bills){

            if(i == 5){
                fiveBills++;
            }

            else if(i == 10){
                tenBills++;
                if(fiveBills == 0) return false;
                else fiveBills--;
            }

            else if(i == 20){
                if(fiveBills >= 3 || (fiveBills >= 1 && tenBills >= 1)){
                    if(fiveBills >= 1 && tenBills >= 1){
                        fiveBills--;
                        tenBills--;
                        continue;
                    }
                    else{
                        fiveBills -= 3;
                    }
                }
                else return false;
            }

        }

        return res;

    }
}