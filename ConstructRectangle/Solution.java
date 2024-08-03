package ConstructRectangle;

class Solution {
    public int[] constructRectangle(int area) {

        int[] res = new int[2];

        int l = area;
        int w = 1;

        // w^2 <= lw = area
        // w <= sqrt(area)

        int diff = Integer.MAX_VALUE;

        for(w = 1; w <= Math.sqrt(area); w++){

            if(area % w == 0){


                if(w <= area / w && l - w < diff){

                    diff = l - w;
                    l = area / w;

                    res[0] = l;
                    res[1] = w;


                }
            }
        }

        return res;

    }
}