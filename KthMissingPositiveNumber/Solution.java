package KthMissingPositiveNumber;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findKthPositive(int[] arr, int k) {

        List<Integer> missingFive = new ArrayList<>();
        int currNum = 1;

        int i = 0;
        while(i < arr.length){

            if(currNum == arr[i]){
                currNum++;
                i++;
            }

            else if(currNum < arr[i]){
                missingFive.add(currNum);
                currNum++;
            }

            if(missingFive.size() == k) return missingFive.get(k-1);

        }

        int lastNum = arr[arr.length-1] + 1;

        while (missingFive.size() != k-1){
            missingFive.add(lastNum);
            lastNum++;
        }

        return lastNum;

    }
}