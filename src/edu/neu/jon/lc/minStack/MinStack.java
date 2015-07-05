package edu.neu.jon.lc.minStack;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> s = new Stack<Integer>();
	private Stack<Integer> minS = new Stack<Integer>();
    public void push(int x) {
    	s.push(x);
    	if(minS.isEmpty() || x <= minS.peek()) {
			minS.push(x);
		}
    }

    public void pop() {
    	int popInt = s.pop();
    	if (minS.peek().equals(popInt)) {
    		minS.pop();
    	}
    }

    public int top() {
    	return s.peek();
    }

    public int getMin() {
    	return minS.peek();
    }
}
