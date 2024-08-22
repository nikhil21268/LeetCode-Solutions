package MakeArrayZeroBySubtracting;

class Solution {
    public int minimumOperations(int[] nums) {

        int res = 0;

        while(true){

            int min = Integer.MAX_VALUE;
            for(int i: nums){
                if(i != 0) min = Math.min(min, i);
            }

            int flg = 0;
            int nextMin = min;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    if(flg == 0) res++;
                    nums[i] -= min;
                    if(nums[i] != 0) nextMin = Math.min(nextMin, nums[i]);
                    flg = 1;
                }
            }

            if(flg == 0) break;

        }

        return res;

    }
}