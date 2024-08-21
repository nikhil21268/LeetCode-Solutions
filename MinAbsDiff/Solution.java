package MinAbsDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);

        int minAbsDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minAbsDiff = Math.min(minAbsDiff, arr[i] - arr[i-1]);
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i-1] == minAbsDiff){
                List<Integer> resIn = new ArrayList<>();
                resIn.add(arr[i-1]);
                resIn.add(arr[i]);
                res.add(resIn);
            }
        }

        return res;

    }
}