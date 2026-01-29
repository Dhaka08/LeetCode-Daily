// LeetCode #225 - Implement Stack using Queues
// Difficulty: Easy
// Date: 29-01-2026
// Approach: Single Queue Rotation
// Time Complexity:
//   push -> O(1)
//   pop  -> O(n)
//   top  -> O(n)
// Space Complexity: O(n)

import java.util.*;

class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        int x = q.peek();
        q.add(q.remove());
        return x;
    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}
