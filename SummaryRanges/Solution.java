package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();

        int l = 0;

        while (l < nums.length){

            int r = l + 1;

            while (r < nums.length && nums[r] == nums[r - 1] + 1){
                r++;
            }

            r--;

            if(l != r) res.add(nums[l] + "->" + nums[r]);
            else {
                res.add("" + nums[r]);
            }

            l = r + 1;

        }

        return res;

    }
}