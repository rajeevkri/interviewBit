package com.interviewBit.math;

import java.util.ArrayList;

/**
 * Given a positive integer N, print all the integers from 1 to N. But for
 * multiples of 3 print “Fizz” instead of the number and for the multiples of 5
 * print “Buzz”. Also for number which are multiple of 3 and 5, prints
 * “FizzBuzz”.
 * 
 * Example
 * 
 * N = 5 Return: [1 2 Fizz 4 Buzz]
 * 
 * @author rajeevsingh
 *
 */
public class FizzBuzz {
	public static ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= A; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				list.add("FizzBuzz");
				// System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				list.add("Fizz");
				// System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				list.add("Buzz");
				// System.out.print("Buzz ");
			} else {
				list.add(i + "");
				// System.out.print(i+" ");
			}
		}
		return list;
	}
}
