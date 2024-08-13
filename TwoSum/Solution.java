package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];

        Arrays.fill(res, -1);


        for (int i = 0; i < nums.length; i++) {

            int toCheck = target - nums[i];

            if(map.containsKey(toCheck)){

                res[0] = i;
                res[1] = map.get(toCheck);
                return res;
            }

            else{

                map.put(nums[i], i);
            }
        }

        return res;
    }
}
