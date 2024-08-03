package IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] res;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i: nums1){
            set1.add(i);
        }

        for(int i: nums2){
            set2.add(i);
        }

        for(int i: set1){
            if(set2.contains(i)) list.add(i);
        }

        res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }
}