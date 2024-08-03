package RemoveDuplicatesFromSortedArr2;

import java.util.HashMap;
// [0,0,1,1,1,1,2,3,3]
// [-,-,-,-,L,-,R,-,-]
// nextDuplicates = 0
// currNum = 1
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;
        while(r < nums.length){
            int count = 1;
            while(r < nums.length-1 && nums[r] == nums[r+1]){
                r++;
                count++;
            }
            for(int i = 0; i < Math.min(count, 2); i++){
                nums[l++] = nums[r];
            }
            r++;
        } return l;
    }
}