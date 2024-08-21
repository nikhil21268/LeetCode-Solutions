package MinCommonVal;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int res = -1;

        int l = 0;
        int r = 0;

        while (l < nums1.length && r < nums2.length){
            if(nums1[l] == nums2[r]) return nums1[l];
            else if(nums1[l] > nums2[r]) r++;
            else if(nums2[r] > nums1[l]) l++;
        }

        return res;
    }
}