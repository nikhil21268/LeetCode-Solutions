package ContainsDuplicate2;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){
                return true;
            } else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}