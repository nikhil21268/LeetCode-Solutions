package PeakElement;

import java.util.HashSet;

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                if(nums[i] > nums[i + 1]){
                    max = Math.max(max, i);
                }
            } else if(i == nums.length - 1){
                if(nums[i] > nums[i - 1]){
                    max = Math.max(max, i);
                }
            } else{
                if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                    max = Math.max(max, i);
                }
            }
        } return max;
    }
}