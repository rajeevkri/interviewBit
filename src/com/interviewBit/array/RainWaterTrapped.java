package com.interviewBit.array;

import java.util.List;

/**
 * 
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * Example :
 * 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 * Rain water trapped: Example 1
 * 
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In
 * this case, 6 units of rain water (blue section) are being trapped.
 * 
 * @author rajeevsingh
 *
 */
public class RainWaterTrapped {
	int trap(final List<Integer> a) {
		int n = a.size();
		if (n == 0) {
			return 0;
		}
		int left[] = new int[n];
		int right[] = new int[n];
		int totalWater = 0;

		left[0] = a.get(0);
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], a.get(i));
		}

		right[n - 1] = a.get(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], a.get(i));
		}

		for (int i = 0; i < n; i++) {
			totalWater += Math.abs(Math.min(left[i], right[i]) - a.get(i));
		}
		return totalWater;
	}
}
