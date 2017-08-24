package com.interviewBit.binarySearch;

/**
 * 
 * Implement pow(x, n) % d.
 * 
 * In other words, given x, n and d,
 * 
 * find (xn % d)
 * 
 * Note that remainders on division cannot be negative. In other words, make
 * sure the answer you return is non negative.
 * 
 * Input : x = 2, n = 3, d = 3 Output : 2
 * 
 * 2^3 % 3 = 8 % 3 = 2.
 * 
 * @author rajeevsingh
 *
 */
public class PowerFunction {
	public static int pow(int x, int n, int d) {
		if (x == 0) {
			return 0;
		}

		long res = 1;
		if (n == 0) {
			res = res % d;
		} else {
			long temp = x % d;
			while (n > 0) {
				if (n % 2 == 1)
					res = (res * temp) % d;

				n = n >> 1; //shifting one bit will make n = n/2 
				temp = (temp * temp) % d;
			}
			while (res < 0) {
				res = (res + d) % d;
			}
		}

		return (int) res;
	}

	public static void main(String[] args) {
		System.out.println(pow(71045970, 41535484, 64735492));
	}
}
