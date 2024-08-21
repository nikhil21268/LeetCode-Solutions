package NextGreaterElement;

import java.util.HashMap;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {

            if(map2.containsKey(nums1[i])){

                int flg = 0;

                for (int j = map2.get(nums1[i]) + 1; j < nums2.length; j++) {

                    if(nums2[j] > nums1[i]) {

                        res[i] = nums2[j];

                        flg = 1;

                        break;

                    }

                }

                if(flg == 0) res[i] = -1;

            }

            else res[i] = -1;

        }

        return res;

    }
}