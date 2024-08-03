package ImageSmoother;

import java.util.Arrays;

class Solution {
    public int[][] imageSmoother(int[][] img) {

        int[][] res = new int[img.length][img[0].length];


        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = img[i][j];
            }
        }


        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {

                int sum = 0;
                int n = 0;

                if(i >= 0 && j+1 >= 0 && i < img.length && j+1 < img[0].length){
                    sum += img[i][j+1];
                    n++;
                }

                if(i+1 >= 0 && j >= 0 && i+1 < img.length && j < img[0].length){
                    sum += img[i+1][j];;
                    n++;
                }

                if(i+1 >= 0 && j+1 >= 0 && i+1 < img.length && j+1 < img[0].length){
                    sum += img[i+1][j+1];
                    n++;
                }

                if(i-1 >= 0 && j >= 0 && i-1 < img.length && j < img[0].length){
                    sum += img[i-1][j];
                    n++;
                }

                if(i >= 0 && j-1 >= 0 && i < img.length && j-1 < img[0].length){
                    sum += img[i][j-1];
                    n++;
                }

                if(i-1 >= 0 && j-1 >= 0 && i-1 < img.length && j-1 < img[0].length){
                    sum += img[i-1][j-1];
                    n++;
                }

                if(i+1 >= 0 && j-1 >= 0 && i+1 < img.length && j-1 < img[0].length){
                    sum += img[i+1][j-1];
                    n++;
                }

                if(i-1 >= 0 && j+1 >= 0 && i-1 < img.length && j+1 < img[0].length){
                    sum += img[i-1][j+1];
                    n++;
                }

                sum += img[i][j];
                n++;


                int avg = Math.floorDiv(sum, n);
                res[i][j] = avg;

            }
        }

        return res;

    }
}