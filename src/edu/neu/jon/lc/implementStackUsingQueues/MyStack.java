package edu.neu.jon.lc.implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> topQ = new LinkedList<Integer>();
	Queue<Integer> cacheQ = new LinkedList<Integer>();

	// Push element x onto stack.
    public void push(int x) {
    	topQ.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	if (topQ.isEmpty()) {
    		Queue<Integer> tmp = topQ;
    		topQ = cacheQ;
    		cacheQ = tmp;
    	}

    	while (topQ.size() > 1) {
        	cacheQ.add(topQ.remove());
        }
    	
    	topQ.remove();
    }

    // Get the top element.
    public int top() {
    	if (topQ.isEmpty()) {
    		Queue<Integer> tmp = topQ;
    		topQ = cacheQ;
    		cacheQ = tmp;
    	}

    	while (topQ.size() > 1) {
        	cacheQ.add(topQ.remove());
        }
    	
    	return topQ.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return topQ.isEmpty() && cacheQ.isEmpty();
    } 
}
