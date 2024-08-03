package ArrangingCioins;

class Solution {
    public int arrangeCoins(int n) {
        if(n == 1 || n == 2) return 1;
        int nStore = n;
        int i;
        for(i = 1; i < n; i++){
            if(nStore >= i){
                nStore -= i;
            }
            else{
                return i-1;
            }
        }
        return nStore != 0 ? (i) : i-1;
    }
}
