package JumpGame2;

class Solution {
    public int jump(int[] nums) {

        int toReachIndex = nums.length-1;

        int[] minNumberJump = new int[nums.length];

        minNumberJump[nums.length-1] = 0;

        for (int i = nums.length-2; i >= 0; i--) {

            int maxJump = nums[i];

            if(i + maxJump >= toReachIndex) minNumberJump[i] = 1;

            else{

                int res = 10001;

                for(int j = i+1; j <= i + maxJump; j++){

                    res = Math.min(res, 1 + minNumberJump[j]);
                }

                minNumberJump[i] = res;
            }

        }


        return minNumberJump[0];
    }
}
