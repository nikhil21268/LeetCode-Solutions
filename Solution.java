import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        int goodPtr = 0;
        int badPtr = -1;
        int contextWindow_badPtr = -1;
        // we don't really need a hashmap for this problem, working with pointers works just fine
        HashMap<Integer, Integer> intCountMap = new HashMap<>();
        while(goodPtr < nums.length){
            if(intCountMap.containsKey(nums[goodPtr])){
                if(intCountMap.get(nums[goodPtr]) < 2) {
                    intCountMap.put(nums[goodPtr], intCountMap.get(nums[goodPtr]) + 1);
                }
                else if(nums[badPtr] == nums[goodPtr]){
                    // don't move badPtr
                }
                else {
                    // we have a problem
                    badPtr = goodPtr;
                    while(goodPtr < nums.length && nums[goodPtr] == nums[badPtr]){
                        goodPtr++;
                    }
                    // now goodPtr is at the next unique (un-processed) element
                    contextWindow_badPtr = goodPtr - badPtr;
                    // swap contents of goodPtr and badPtr;

                }
            }
            else{
                intCountMap.put(nums[goodPtr], 1);
            }
            if(badPtr != -1 && badPtr != goodPtr){
                // swap the contents of goodPtr and badPtr
                int temp = nums[goodPtr];
                nums[goodPtr] = nums[badPtr];
                nums[badPtr] = temp;
                badPtr++;
            }
            goodPtr++;
        }
        return badPtr;
    }
}