package ValidWordSquare;

import java.util.List;

class Solution {
    public boolean validWordSquare(List<String> words) {

        boolean bool = false;

        int size = 0;

        for(String str: words){
            size = Math.max(str.length(), size);
        }

        size = Math.max(size, words.size());

        char[][] arr = new char[size][size];


        for (int i = 0; i < words.size(); i++) {
            String str = words.get(i);
            for (int j = 0; j < size; j++) {
                if(j >= str.length()) arr[i][j] = ' ';
                else arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(arr[i][j] != arr[j][i]) return false;
            }
        }

        return true;
    }
}
