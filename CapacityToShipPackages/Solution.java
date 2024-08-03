package CapacityToShipPackages;

class Solution {
    // [1,2,3,1,1]
    // currSum = 5
    // mid = 5
    // days = 2
    public boolean check(int[] weights, int days, int mid) {
        int ptr = 0;
        int currSum = 0;
        while(ptr < weights.length){
            if(currSum + weights[ptr] > mid){
                currSum = weights[ptr];
                days--;
                ptr++;
            }
            else{
                currSum += weights[ptr];
                ptr++;
            }
        }
        if(days >= 1) return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int upperBound = 0;
        int lowerBound = 0;
        for (int weight : weights) {
            upperBound += weight;
            lowerBound = Math.max(lowerBound, weight);
        }
        int res = Integer.MAX_VALUE;
        int l = lowerBound;
        int r = upperBound;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(check(weights, days, mid)){
                res = Math.min(res, mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
