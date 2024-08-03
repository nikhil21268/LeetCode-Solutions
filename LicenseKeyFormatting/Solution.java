package LicenseKeyFormatting;

import java.util.ArrayList;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();

        ArrayList<Character> data = new ArrayList<>();

        for(char c: s.toCharArray()){
            if(c != '-'){
                if(Character.isLowerCase(c)) data.add(Character.toUpperCase(c));
                else data.add(c);
            }
        }

        if(data.size() == 0) return "";

        for(int i = data.size() - 1; i >= 0; i -= k){
            for(int j = i; j > i - k; j--){
                if(j < 0){
                    break;
                }
                res.append(data.get(j));
            }
            res.append('-');
        }

        System.out.println(res);

        if(res.charAt(res.length()-1) == '-') res.deleteCharAt(res.length()-1);
        return res.reverse().toString();

    }
}