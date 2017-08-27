package com.interviewBit.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * 
 * [1,3,5,6], 5 → 2
 *
 * [1,3,5,6], 2 → 1
 *
 * [1,3,5,6], 7 → 4
 *
 * [1,3,5,6], 0 → 0
 * 
 * @author rajeevsingh
 *
 */
public class SortedInsertPos {

	public static void main(String[] args) {
		int B = 2;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(5);
		A.add(6);

		System.out.println(searchInsert(A, B));
	}

	public static int searchInsert(ArrayList<Integer> a, int b) {
		int binarySearch = Collections.binarySearch(a, b);
		return binarySearch < 0 ? Math.abs(binarySearch) - 1 : binarySearch;
	}
}
