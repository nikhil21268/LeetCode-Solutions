package CountElementsWithMaxFrequency;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }

        int maxFreq = -1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            maxFreq = Math.max(maxFreq, entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == maxFreq) res += maxFreq;
        }

        return res;

    }
}