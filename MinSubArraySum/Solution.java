package MinSubArraySum;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l = 0;
        int r = 0;

        int globalMinLen = Integer.MAX_VALUE;

        int currSum = 0;

        while (r < nums.length){

            currSum += nums[r];

            if(currSum >= target){
                globalMinLen = Math.min(globalMinLen, r - l + 1);
                l++;
                r = l;
                currSum = 0;
                continue;
            }

            r++;

        }

        return globalMinLen == Integer.MAX_VALUE ? 0 : globalMinLen;

    }
}