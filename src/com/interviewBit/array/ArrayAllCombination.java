package com.interviewBit.array;

public class ArrayAllCombination {

	static void generate(int n, int k, int[] a, int index) {
		if (index == n) {
			printUtil(a);
		} else {
			if (index == 0) {
				for (int i = 1; i <= k - n + 1; i++) {
					a[index] = i;
					generate(n, k, a, index + 1);
				}
			} else {
				// index is the index we want to add
				// index - 1 is the index(max index) that is in the array now.
				// k - (index - 1) - 1 is amount left
				for (int i = a[index - 1] + 1; i <= k - (n - (index - 1) - 1) + 1; i++) {
					a[index] = i;
					generate(n, k, a, index + 1);
				}
			}
		}
	}

	static void printUtil(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("---------------");
	}

}
