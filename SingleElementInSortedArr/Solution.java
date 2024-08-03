package SingleElementInSortedArr;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int l = 0;
        int r = 1;
        while(l < nums.length - 1){
            if(nums[l] == nums[r]){
                l += 2;
                r += 2;
            } else {
                return nums[l];
            }
        } return nums[l];
    }
}
