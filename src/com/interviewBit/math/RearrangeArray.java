package com.interviewBit.math;

/**
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra
 * space.
 * 
 * Example:
 * 
 * Input : [1, 0] Return : [0, 1] Lets say N = size of the array. Then,
 * following holds true : All elements in the array are in the range [0, N-1] N
 * * N does not overflow for a signed integer
 * 
 * 
 * @author rajeevsingh
 *
 */
public class RearrangeArray {
	// The function to rearrange an array in-place so that arr[i]
	// becomes arr[arr[i]].
	static int[] rearrange(int arr[], int n) {
		// First step: Increase all values by (arr[arr[i]]%n)*n
		for (int i = 0; i < n; i++) {
			int x = arr[arr[i]];
			x = x%n;
			arr[i] += x* n;
		}

		// Second Step: Divide all values by n
		for (int i = 0; i < n; i++)
			arr[i] /= n;
		return arr;
	}

	public static void main(String[] args) {
		// System.out.println(fizzBuzz(3));
		int arr[] = { 4, 0, 2, 1, 3 };
		int[] newArr = rearrange(arr, arr.length);
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
}
