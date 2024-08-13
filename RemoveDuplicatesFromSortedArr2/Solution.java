package RemoveDuplicatesFromSortedArr2;


import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        if(n <= 2) return n;

        int l = 0;
        int r = 0;
        int lStore = -1;

        int idx = -1;

        while (l < n){

            while(r < n && nums[r] == nums[l]){

                r++;
            }

            lStore = l;

            int flg = 0;

            if(r - l > 2){

                l = l + 2;

                lStore = l;

                idx = lStore;

                while(r < n){

                    int temp = nums[l];

                    nums[l] = nums[r];

                    nums[r] = temp;

                    flg = 1;
                    l++;
                    r++;

                }



                l = lStore;
                r = l;

            }

            else{

                idx = l;

                l = r;

                if(flg == 0) idx = l;

                lStore = l;
            }

        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if(i < 2) {

                if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);

                else{

                    map.put(nums[i], 1);
                }

                continue;
            }

            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);

            else{

                map.put(nums[i], 1);
            }

            if(map.get(nums[i]) > 2) return i;


            if(nums[i-2] == nums[i] && nums[i] == nums[i-1]) return i;
        }

        return idx;
    }
}