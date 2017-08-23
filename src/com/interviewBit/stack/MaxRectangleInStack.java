package com.interviewBit.stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * Given n non-negative integers representing the histogram’s bar height where
 * the width of each bar is 1, find the area of largest rectangle in the
 * histogram.
 * 
 * @author rajeevsingh
 *
 */
public class MaxRectangleInStack {
	public int largestRectangleArea(ArrayList<Integer> a) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		int maxArea = 0;
		int i = 0;
		int n = a.size();
		while (i < n) {
			if (st.isEmpty() || a.get(st.peek()) <= a.get(i)) {
				st.push(i);
				i++;
			} else {
				int pop = st.pop();
				if (st.isEmpty()) {
					area = a.get(pop) * i;
				} else {
					area = a.get(pop) * (i - st.peek() - 1);
				}
				if (area > maxArea) {
					maxArea = area;
				}
			}
		}

		while (!st.isEmpty()) {
			int pop = st.pop();
			if (st.isEmpty()) {
				area = a.get(pop) * i;
			} else {
				area = a.get(pop) * (i - st.peek() - 1);
			}
			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;
	}
}
