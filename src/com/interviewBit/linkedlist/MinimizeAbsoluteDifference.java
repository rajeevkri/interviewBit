package com.interviewBit.linkedlist;

import java.util.ArrayList;

/**
 * Efficient Solution Let ‘p’ be size of A[], ‘q’ be size of B[] and ‘r’ be size
 * of C[]
 * 
 * 1) Start with i=0, j=0 and k=0 (Three index variables for A, B and C
 * respectively)
 * 
 * // p, q and r are sizes of A[], B[] and C[] respectively. 2) Do following
 * while i < p and j < q and k < r a) Find min and maximum of A[i], B[j] and
 * C[k] b) Compute diff = max(X, Y, Z) - min(A[i], B[j], C[k]). c) If new result
 * is less than current result, change it to the new result. d) Increment the
 * pointer of the array which contains the minimum.
 * 
 * @author srajeev
 *
 */
public class MinimizeAbsoluteDifference {
	public int minimumDiff(int[] A, int[] B, int[] C) {
		int p = A.length;
		int q = B.length;
		int r = C.length;
		int i = 0, j = 0, k = 0;
		int result = Integer.MAX_VALUE;
		while (i < p && j < q && k < r) {
			int min = A[i];
			int max = A[i];
			int x = 1;
			if (min > B[j]) {
				min = B[j];
				x = 2;
			} else if (max < B[j]) {
				max = B[j];
			}
			if (min > C[k]) {
				min = C[k];
				x = 3;
			} else if (max < C[k]) {
				max = C[k];
			}
			int diff = max - min;
			if (diff < result) {
				result = diff;
			}
			if (x == 1)
				i++;
			else if (x == 2)
				j++;
			else if (x == 3)
				k++;
		}
		return result;
	}
	
	public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
		int p = A.size();
		int q = B.size();
		int r = C.size();
		int i = 0, j = 0, k = 0;
		int result = Integer.MAX_VALUE;
		while (i < p && j < q && k < r) {
			int min = A.get(i);
			int max = A.get(i);
			int x = 1;
			if (min > B.get(j)) {
				min = B.get(j);
				x = 2;
			} else if (max < B.get(j)) {
				max = B.get(j);
			}
			if (min > C.get(k)) {
				min = C.get(k);
				x = 3;
			} else if (max < C.get(k)) {
				max = C.get(k);
			}
			int diff = max - min;
			if (diff < result) {
				result = diff;
			}
			if (x == 1)
				i++;
			else if (x == 2)
				j++;
			else if (x == 3)
				k++;
		}
		return result;
    }
}
