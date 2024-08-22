package MonotonicArray;

class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean res = true;

        int dir = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(dir == 0){
                if(nums[i+1] > nums[i]) dir = 1;
                else if(nums[i+1] < nums[i]) dir = -1;
                else continue;
            }

            if(dir == 1 && nums[i+1] < nums[i]) return false;
            else if(dir == -1 && nums[i+1] > nums[i]) return false;
        }

        return res;

    }
}