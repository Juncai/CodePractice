package edu.neu.jon.lc.implementQueueUsingStacks;

import java.util.Stack;

public class Solution {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	// Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        s1ToS2();
        s2.pop();
    }

    // Get the front element.
    public int peek() {
    	s1ToS2();
    	return s2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    
    private void s1ToS2() {
    	if (s2.isEmpty()) {
        	while (!s1.isEmpty()) {
        		s2.push(s1.pop());
        	}
        }
    }
}
