package hIndex;

import java.util.Arrays;

public class Solution {
    public boolean checkCitations(int[] citations, int numCheck){
        int count = 0;
        for(int i = citations.length - 1; i >= 0; i--){
            if(citations[i] >= numCheck){
                count++;
            }
        }
        if(count >= numCheck)
            return true;
        else
            return false;
    }
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int left = 0;
        int res = 0;
        int right = citations.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(checkCitations(citations, citations[mid])){
                res = Math.max(res, citations[mid]);
                left = mid + 1;
            }
            else if(!checkCitations(citations, citations[mid])){
                right = mid - 1;
            }
        }
        return res;
    }
}

