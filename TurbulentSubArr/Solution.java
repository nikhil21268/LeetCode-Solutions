package TurbulentSubArr;

class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1) return 1;
        int max = 0;
        int left = 0;
        int right = 1;
        int prevDir = arr[1] > arr[0] ? 1 : -1;
        while(right < arr.length){
            if(arr[right] == arr[right - 1]) left = right;
            else if((arr[right] > arr[right - 1] && prevDir == -1) || (arr[right] < arr[right - 1] && prevDir == 1)){
                prevDir *= -1;
                max = Math.max(max, right - left + 1);
            } else {
                left = right;
                prevDir = 0;
            }
            right++;
        } return max;
    }
}