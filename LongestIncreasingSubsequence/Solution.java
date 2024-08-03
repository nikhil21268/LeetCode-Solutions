package LongestIncreasingSubsequence;

import java.util.Arrays;

class Solution {
    public int DFS(int[] nums, int maxLen, int idx, int prevIdx){
        // base case: if idx exceeds the array length or increasing subsequence cannot be created
        if(idx >= nums.length) return maxLen;
        // if the idx is already in the memory, return the value
        if(memory[idx] != -1) return memory[idx];
        // call DFS function for all the remaining elements with index > idx
        for(int i = idx + 1; i < nums.length; i++) DFS(nums, maxLen, i, idx);
        // Update maxLen if a longer LIS is found, and update memory
        if(nums[idx] > nums[prevIdx]){
            maxLen++;
            memory[idx] = maxLen;
        }
        return 0;
    }
    int[] memory;
    public int lengthOfLIS(int[] nums) {
        memory = new int[nums.length];
        Arrays.fill(memory, -1);
        DFS(nums, 0, 0, 0);
        return memory[nums.length - 1];
    }
}