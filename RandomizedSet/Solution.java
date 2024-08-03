package RandomizedSet;

import java.util.HashSet;

class RandomizedSet {
    HashSet<Integer> mySet;
    public RandomizedSet() {
        // initialize a RandomizedSet object
        mySet = new HashSet<>();
    }

    public boolean insert(int val) {
        if(!mySet.contains(val)){
            mySet.add(val);
            return true;
        } return false;
    }

    public boolean remove(int val) {
        if(mySet.contains(val)){
            mySet.remove(val);
            return true;
        } return false;
    }

    // hashset doesn't support a get method (doesn't support both simple and randomized)
    public int getRandom() {
        // wouldn't work with hashsets
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */