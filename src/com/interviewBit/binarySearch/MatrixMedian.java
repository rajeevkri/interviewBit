package com.interviewBit.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Given a N × M matrix in which each row is sorted, find the overall median of
 * the matrix. Assume N*M is odd.
 * 
 * For example,
 * 
 * Matrix = [1, 3, 5] [2, 6, 9] [3, 6, 9]
 * 
 * A = [1, 2, 3, 3, 5, 6, 6, 9, 9]
 * 
 * Median is 5. So, we return 5. Note: No extra memory is allowed.
 * 
 * @author rajeevsingh
 *
 */
public class MatrixMedian {
	public static void main(String[] args) {
		int arr[] = {2,6,9};
		System.out.println(Arrays.binarySearch(arr, 5));
	}

	public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        if(n == 0) return -1;
        int m = A.get(0).size();
        int lo = 0;
        int hi = Integer.MAX_VALUE;
        int x = 1;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(isLessThanHalf(A, mid)) {
                lo = mid+1;
            } else {
                x = mid;
                hi = mid-1;
            }
        }
        return x;
    }
    boolean isLessThanHalf(ArrayList<ArrayList<Integer>> a, int num) {
        int N = a.size();
        int M = a.get(0).size();
        int count = 0;
          
        for(int i = 0; i < N; i++) {
            count += getCount(a.get(i), num);
         //   System.out.println(count);
        }
       // System.out.println();
        return count < (N*M)/2 + 1;
    }
    int getCount(ArrayList<Integer> a, int n) {
        int lo = 0;
        int hi = a.size()-1;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(a.get(mid) > n) hi = mid-1;
            else lo = mid+1;
        }
        return lo;
    }

}
