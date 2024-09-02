package HighFive;

import java.util.*;

class Solution {
    public int[][] highFive(int[][] items) {

        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(int[] arr: items){

            int id = arr[0];
            int score = arr[1];

            if(map.containsKey(id)){

                PriorityQueue<Integer> q = map.get(id);
                q.add(score);
                map.put(id, q);

            }

            else{

                PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
                q.add(score);
                map.put(id, q);

            }
        }

        int[][] res = new int[map.size()][2];

        int idx = 0;
        for(Map.Entry<Integer, PriorityQueue<Integer>> entry: map.entrySet()){

            PriorityQueue<Integer> q = entry.getValue();

            int sum = 0;
            for(int i = 0; i < 5; i++){

                if(!q.isEmpty()) {
                    int num = q.poll();
                    sum += num;
                }
            }

            res[idx][0] = entry.getKey();
            res[idx][1] = sum / 5;
            idx++;

        }

        return res;
    }
}
