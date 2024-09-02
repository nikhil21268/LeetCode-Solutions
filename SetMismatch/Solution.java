package SetMismatch;

import java.util.HashSet;

class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] res = new int[2];

        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) res[0] = nums[i];
            else{
                set.add(nums[i]);
            }
            arr[nums[i]-1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                res[1] = i+1;
            }
        }

        return res;

    }
}