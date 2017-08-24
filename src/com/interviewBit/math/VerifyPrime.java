package com.interviewBit.math;

public class VerifyPrime {
	public int isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return a;
		}
		return 0;
	}
}
