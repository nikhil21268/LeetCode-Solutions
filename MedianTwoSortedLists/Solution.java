package MedianTwoSortedLists;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double res = 0;

        double[] newArr = new double[nums1.length + nums2.length];

        int l = 0;
        int r = 0;

        int idx = 0;
        while (l < nums1.length && r < nums2.length){
            if(nums1[l] < nums2[r]){
                newArr[idx] = nums1[l];
                l++;
                idx++;
            }

            else if(nums1[l] > nums2[r]){
                newArr[idx] = nums2[r];
                r++;
                idx++;
            }

            else{
                newArr[idx] = nums1[l];
                idx++;
                l++;
                newArr[idx] = nums2[r];
                r++;
                idx++;
            }
        }

        while (l < nums1.length){
            newArr[idx] = nums1[l];
            l++;
            idx++;
        }


        while (r < nums2.length){
            newArr[idx] = nums2[r];
            r++;
            idx++;
        }

        if(newArr.length % 2 != 0) return newArr[newArr.length / 2];

        double left = newArr[(newArr.length / 2) - 1];
        double right = newArr[newArr.length / 2];

        res = (left + right) / 2;

        return res;

    }
}