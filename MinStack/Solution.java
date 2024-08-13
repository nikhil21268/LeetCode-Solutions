package MinStack;

import java.util.PriorityQueue;
import java.util.Stack;

class MinStack {

    PriorityQueue<Integer> minHeap;
    Stack<Integer> stk = new Stack<>();

    public MinStack() {
        minHeap = new PriorityQueue<>();
        stk = new Stack<>();
    }

    public void push(int val) {
        minHeap.add(val);
        stk.push(val);
    }

    public void pop() {

        minHeap.remove(stk.pop());
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return minHeap.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
