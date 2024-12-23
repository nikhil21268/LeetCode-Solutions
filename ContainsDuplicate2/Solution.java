package ContainsDuplicate2;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        boolean res = false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])){

                if(Math.abs(i - map.get(nums[i])) <= k) return true;

                map.put(nums[i], i);
            }

            else{

                map.put(nums[i], i);
            }

        }

        return res;
    }
}