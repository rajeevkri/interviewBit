package com.interviewBit.string;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * 
 * @author srajeev
 *
 */
public class DivideIntegers {
	public static int divide(int dividend, int divisor) {

		long n = dividend, m = divisor;
		int sign = n < 0 ^ m < 0 ? -1 : 1;

		n = Math.abs(n);
		m = Math.abs(m);

		long q = 0;

		for (long t = 0, i = 31; i >= 0; i--)
			if (t + (m << i) <= n) {
				t += m << i;
				q |= 1L << i;
			}

		if (sign < 0)
			q = -q;

		return (int) ((q >= Integer.MAX_VALUE || q < Integer.MIN_VALUE) ? Integer.MAX_VALUE : q);
	}

	public static void main(String[] args) {
		System.out.println(divide(-2147483648, -1));
	}

}
