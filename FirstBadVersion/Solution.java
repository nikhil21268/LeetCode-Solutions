package FirstBadVersion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        int res = Integer.MAX_VALUE;
        while(l <= r){
            int mid = r + (l - r) / 2;
            if(isBadVersion(mid)){
                res = Math.min(res, mid);
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
}