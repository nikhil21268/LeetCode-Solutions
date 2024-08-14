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

        if(citations.length == 1 && citations[0] == 0) return 0;
        if(citations.length == 1) return 1;

        Arrays.sort(citations);
        int left = 0;
        int res = 0;
        int right = citations.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(checkCitations(citations, mid)){
                res = Math.max(res, mid);
                left = mid + 1;
            }
            else if(!checkCitations(citations, mid)){
                right = mid - 1;
            }
        }

        int flg = 0;
        for (int i = 0; i < citations.length; i++) {
            if(citations[i] != 0) flg = 1;
        }

        if(res == 0){
            int cnt = 0;
            for (int i = 0; i < citations.length; i++) {
                if(citations[i] != 0) cnt++;
            }
            return cnt;
        }


        if(flg == 0) return 0;

        return res == 0 ? citations.length : res;
    }
}

