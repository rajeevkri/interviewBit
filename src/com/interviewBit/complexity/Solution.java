package com.interviewBit.complexity;

public class Solution {
	public static void main(String[] args) {
//		int N = 8;
//		int count = 0;
//		for (int i = N; i > 0; i /= 2) {
//			for (int j = 0; j < i; j++) {
//				count += 1;
//			}
//		}
//		System.out.println(count);
		int []arr = {6,5,3,4};
		int j = 0;
		int n= arr.length;
        for(int i = 0; i < n; ++i) {
            while(j < n && arr[i] < arr[j]) {
                j++;
            }
        }
        System.out.println(j);
	}
}
