package LRUCache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

class LRUCache {

    LinkedHashMap<Integer, Integer> set;

    public LRUCache(int capacity) {

        set = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {

        if(set.containsKey(key)) return set.get(key);
        return -1;
    }

    public void put(int key, int value) {
        set.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
