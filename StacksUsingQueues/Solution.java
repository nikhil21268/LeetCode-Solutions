package StacksUsingQueues;

import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    Deque<Integer> q;
    public MyStack() {
         q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.push(x);
    }

    public int pop() {
        return q.pop();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        if(q.size() == 0) return true;
        return false;
    }
}


//MyStack obj = new MyStack();
//obj.push(x);
//int param_2 = obj.pop();
//int param_3 = obj.top();
//boolean param_4 = obj.empty();