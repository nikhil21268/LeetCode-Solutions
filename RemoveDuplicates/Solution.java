package RemoveDuplicates;

class Solution {
    public String removeDuplicates(String s) {

        StringBuilder res = new StringBuilder(s);

        int l = 0;
        int r = l + 1;

        while (r < res.length()){

            if(res.charAt(l) != res.charAt(r)){
                l++;
                r++;
            }

            else{
                res.delete(l, r+1);
                l--;
                r = l + 1;

                if(l < 0){
                    l = 0;
                    r = l + 1;
                }

            }

        }

        return res.toString();

    }
}