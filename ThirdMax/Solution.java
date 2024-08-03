package ThirdMax;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            if(!set.contains(i)){
                max = Math.max(max, i);
                maxHeap.add(i);
                set.add(i);
            }
        }

        if(set.size() < 3) return max;

        int first = maxHeap.poll();
        int second = maxHeap.poll();
        return maxHeap.poll();
    }
}
