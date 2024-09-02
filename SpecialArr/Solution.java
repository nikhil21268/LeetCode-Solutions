package SpecialArr;

class Solution {

    public boolean check(int n, int[] arr){

        int cnt = 0;
        for(int i: arr){
            if(i >= n) cnt++;
        }

        if(cnt == n) return true;
        return false;

    }

    public int specialArray(int[] nums) {

        int res = -1;

        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        for (int i = 1; i <= max; i++) {
            if(i < 0) continue;
            if(check(i, nums)) return i;
        }

        return res;

    }
}