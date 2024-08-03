package GasStation;

class Solution {
    public boolean checkStartingPoint(int[] gas, int[] cost, int startingPoint){
        int len = gas.length;
        int itr = startingPoint;
        int currentGas = 0;
        while(true){
            currentGas += gas[itr];
            currentGas -= cost[itr];
            if(currentGas < 0)
                return false;
            itr = (itr + 1) % len;
            if(itr == startingPoint)
                return true;
        }
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; i++){
            if(checkStartingPoint(gas, cost, i)){
                  return i;
            }
        }
        return -1;
    }
}