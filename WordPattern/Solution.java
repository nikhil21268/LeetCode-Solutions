package WordPattern;


import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<String, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        String[] strArr = s.split(" ");


        int idx = 1;
        for(String str: strArr){

            if(map.containsKey(str)){

                sb.append(map.get(str));
            }

            else{

                map.put(str, idx);

                sb.append(idx);

                idx++;
            }
        }

        StringBuilder sb2 = new StringBuilder();

        HashMap<Character, Integer> map2 = new HashMap<>();

        idx = 1;
        for(char c: pattern.toCharArray()){

            if(map2.containsKey(c)){

                sb2.append(map2.get(c));
            }

            else{

                map2.put(c, idx);

                sb2.append(idx);

                idx++;
            }
        }


        if(sb.length() != sb2.length()) return false;

        return sb.toString().equals(sb2.toString()) ? true : false;

    }
}