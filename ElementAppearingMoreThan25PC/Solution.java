package ElementAppearingMoreThan25PC;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSpecialInteger(int[] arr) {

        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: arr){
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }

        int max = -1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            max = Math.max(max, entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(max == entry.getValue()) return entry.getKey();
        }

        return res;

    }
}