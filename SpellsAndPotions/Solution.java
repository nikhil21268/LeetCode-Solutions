package SpellsAndPotions;

    import java.util.Arrays;

    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int[] result = new int[spells.length];
            Arrays.sort(potions);
            int idx = 0;
            for(int i: spells){
                int l = 0;
                int r = potions.length - 1;
                int weakestPos = -1;
                while(l <= r){
                    int mid = l + (r - l) / 2;
                    if((long) i * potions[mid] >= success){
                        r = mid - 1;
                        weakestPos = mid;
                    } else{
                        l = mid + 1;
                    }
                }
                result[idx] = weakestPos == -1 ? 0 : potions.length - weakestPos;
                idx++;
            } return result;
        }
    }