package QueueUsingStacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

class MyQueue {
    Deque<Integer> q;
    public MyQueue() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.addFirst(x);
    }

    public int pop() {
        return q.pollLast();
    }

    public int peek() {
        return q.peekLast();
    }

    public boolean empty() {
        return q.isEmpty() ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
