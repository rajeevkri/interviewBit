package com.interviewBit.math;

/**
 * Largest Coprime DivisorBookmark Suggest Edit You are given two positive
 * numbers A and B. You need to find the maximum valued integer X such that:
 * 
 * X divides A i.e. A % X = 0 X and B are co-prime i.e. gcd(X, B) = 1 For
 * example,
 * 
 * A = 30 B = 12 We return X = 5
 * 
 * 
 * Hint--We know A is the greatest number dividing A. So if A and B are coprime,
 * we can return the value of X to be A. Else, we can try to remove the common
 * factors of A and B from A.
 * 
 * @author rajeevsingh
 *
 */
public class LargestCoprimeDivisor {
	public int cpFact(int A, int B) {
		int x = A;
		int gcd = gcd(A, B);
		for (int i = 2; i <= gcd; i++) {
			while (gcd % i == 0 && x % i == 0) {
				x = x / i;
			}
		}
		return x;
	}

	int gcd(int A, int B) {
		if (B == 0)
			return A;
		return gcd(B, A % B);
	}
}
