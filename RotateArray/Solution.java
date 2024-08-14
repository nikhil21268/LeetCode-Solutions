package RotateArray;

class Solution {
    public void rotate(int[] nums, int k) {

        if(k > nums.length) k = k % nums.length;

        if(k == 0) return;

        int[] arrCopy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arrCopy[i] = nums[i];
        }

        int[] arrVisited = new int[nums.length];

        int badIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if(i + k < nums.length) {
                if(arrVisited[i] == 1){
                    badIdx = i;
                    break;
                }
                nums[i + k] = nums[i];
                arrVisited[i + k] = 1;
            }
            else {
                badIdx = i;
                break;
            }
        }



        while(badIdx + k < nums.length){
            nums[badIdx + k] = arrCopy[badIdx];
            badIdx++;
        }

        for (int i = badIdx; i < nums.length; i++) {
            nums[i - (nums.length - k)] = arrCopy[i];
            arrVisited[i - (nums.length - k)] = 1;
        }

    }
}
