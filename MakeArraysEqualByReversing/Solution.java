package MakeArraysEqualByReversing;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        boolean res = true;

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int i: target){
            if(map1.containsKey(i)) map1.put(i, map1.get(i) + 1);
            else map1.put(i, 1);
        }

        for(int i: arr){
            if(map2.containsKey(i)) map2.put(i, map2.get(i) + 1);
            else map2.put(i, 1);
        }

        return map1.equals(map2);

        /*
        for(Map.Entry<Integer, Integer> entry: map1.entrySet()){
            if(map2.containsKey(entry.getKey()) && map2.get(entry.getKey()) != entry.getValue()) return false;
            else if(!map2.containsKey(entry.getKey())) return false;
        }

        return res;
        */

    }
}