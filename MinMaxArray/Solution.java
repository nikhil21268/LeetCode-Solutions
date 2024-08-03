package MinMaxArray;
// nums = [3,7,1,6]
class Solution {
    public int minimizeArrayValue(int[] nums) {
        int r = 0;
        long max = nums[0];
        long sum = 0;
        while(r < nums.length){
            sum += nums[r];
            long val = Math.ceilDiv(sum, r + 1);
            max = Math.max(max, val);
            r++;
        } return (int) max;
    }
}