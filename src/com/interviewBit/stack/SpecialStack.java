package com.interviewBit.stack;

import java.util.Stack;

public class SpecialStack {
	Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int x) {
        
        Integer m = getMin();
        if(x<m || minStack.isEmpty()) {
            minStack.push(x);
        }
        mainStack.push(x);
    }

    public void pop() {
        if(!mainStack.isEmpty()) {
            Integer pop = mainStack.pop();
            Integer peek = top();
            Integer m = getMin();
            if( (pop == m && peek != m && !minStack.isEmpty())) {
                minStack.pop();
            }
            
        }
        
    }


    public Integer top() {
        if(!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        return -1;
    }

    public Integer getMin() {
        if(!mainStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}
