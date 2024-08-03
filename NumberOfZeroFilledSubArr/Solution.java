package NumberOfZeroFilledSubArr;

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0;
        long res = 0;
        for (int i: nums) {
            if(i == 0){
                cnt++;
                res += cnt;
            } else{
                cnt = 0;
            }
        } return res;
    }
}