package MinIndexSumofTwoLists;

import java.util.ArrayList;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        ArrayList<String> res = new ArrayList<>();

        int leastIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++){

            for (int j = 0; j < list2.length; j++){

                if(list1[i].equals(list2[j])){

                    leastIndexSum = Math.min(leastIndexSum, i+j);
                }
            }
        }

        System.out.println(leastIndexSum);

        for (int i = 0; i < list1.length; i++){

            for (int j = 0; j < list2.length; j++){

                if(list1[i].equals(list2[j]) && i+j == leastIndexSum){

                    res.add(list1[i]);
                }
            }
        }


        String[] str = new String[res.size()];

        for(int i = 0; i < res.size(); i++){

            str[i] = res.get(i);
        }

        return str;
    }
}
