package SingleNumber;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){

            if(map.containsKey(i)) map.put(i, map.get(i) + 1);

            else map.put(i, 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            if(entry.getValue() == 1) return entry.getKey();
        }

        return -1;
    }
}
