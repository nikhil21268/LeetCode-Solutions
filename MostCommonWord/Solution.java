package MostCommonWord;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String res = "";

        HashMap<String, Integer> freqMap = new HashMap<>();

        for(String str: paragraph.split(" ")){

            String str2 = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if(freqMap.containsKey(str2)) freqMap.put(str2, 1 + freqMap.get(str2));
            else freqMap.put(str2, 1);

        }

        HashSet<String> set = new HashSet<>();

        for(String str: banned){
            set.add(str);
        }

        int maxFreg = -1;

        for(Map.Entry<String, Integer> entry: freqMap.entrySet()){

            if(entry.getValue() > maxFreg && !set.contains(entry.getKey())) {

                maxFreg = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }
}
