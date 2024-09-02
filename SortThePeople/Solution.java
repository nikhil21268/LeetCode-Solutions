package SortThePeople;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        String[] res = new String[names.length];

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if(map.containsKey(names[i])){
                map.put(names[i] + "-" + i, heights[i]);
                list.add(names[i]+ "-" + i);
                continue;
            }
            map.put(names[i], heights[i]);
            list.add(names[i]);
        }

        Collections.sort(list, (a, b) -> {
            int heightDiff = map.get(b) - map.get(a);
            return heightDiff;
        });

        for (int i = 0; i < names.length; i++) {
            if(list.get(i).contains("-")){
                String[] strNew = list.get(i).split("-");
                System.out.println("len = " + strNew.length);
                for(String s: strNew) System.out.println("string = " + s);
                res[i] = strNew[0];
                continue;
            }
            res[i] = list.get(i);
        }

        return res;

    }
}