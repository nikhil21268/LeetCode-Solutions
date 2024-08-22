package DegreeOfArray;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {

        int minLen = 0;
        int deg = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i: nums){
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            deg = Math.max(deg, entry.getValue());

        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            

        }

        return minLen;

    }
}