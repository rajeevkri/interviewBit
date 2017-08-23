package com.interviewBit.binarySearch;

/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * If x is not a perfect square, return floor(sqrt(x))
 * 
 * Example :
 * 
 * Input : 11 Output : 3
 * 
 * 
 * DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
 * 
 * @author rajeevsingh
 *
 */
public class SquareRoot {
	public static int sqrt(int a) {
		long i = 0;
		long j = a / 2 + 1;
		while (i <= j) {
			long mid = (i + j) / 2;
			if (mid * mid == a)
				return (int) mid;
			if (mid * mid < a)
				i = mid + 1;
			else
				j = mid - 1;
		}
		return (int) j;
	}

	public static void main(String[] args) {
		System.out.println(sqrt(4));
	}
}
