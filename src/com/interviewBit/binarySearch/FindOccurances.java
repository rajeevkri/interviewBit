package com.interviewBit.binarySearch;

import java.util.List;

public class FindOccurances {
	public int findCount(final List<Integer> a, int b) {
	    int upperIndex = findUpperIndex(a, b);
	    
	    return (upperIndex == -1) ? 0 : upperIndex - findLowerIndex(a, b) + 1;
	}
	
	public int findLowerIndex(final List<Integer> a, int b) {
	    int index0 = 0;
	    int index1 = a.size() - 1;
	    int lowerIndex = -1;
	    
	    while (index0 <= index1) {
	        int index = (index0 + index1) >> 1;
	        int value = a.get(index).intValue();
	        if (value < b) {
	            index0 = index + 1;
	        } else if (value >= b) {
	            index1 = index - 1;
	            if (value == b) lowerIndex = index;
	        }
	    }
	    
	    return lowerIndex;
	}
	
	public int findUpperIndex(final List<Integer> a, int b) {
	    int index0 = 0;
	    int index1 = a.size() - 1;
	    int upperIndex = -1;
	    
	    while (index0 <= index1) {
	        int index = (index0 + index1) >> 1;
	        int value = a.get(index).intValue();
	        if (value <= b) {
	            index0 = index + 1;
	            if (value == b) upperIndex = index;
	        } else if (value > b) {
	            index1 = index - 1;
	        }
	    }
	    
	    return upperIndex;
	}
}
