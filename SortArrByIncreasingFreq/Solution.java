package SortArrByIncreasingFreq;

import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        int[] res = new int[nums.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
            list.add(i);
        }

        Collections.sort(list, (a, b) -> {
            int freqDiff = map.get(a) - map.get(b);
            if(freqDiff == 0) return b - a;
            return freqDiff;
        });

        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;

    }
}