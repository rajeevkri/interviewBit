package com.interviewBit.string;

/**
 * 
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 
 * 1, 11, 21, 1211, 111221, ... 1 is read off as one 1 or 11. 11 is read off as
 * two 1s or 21.
 * 
 * 21 is read off as one 2, then one 1 or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * Example:
 * 
 * if n = 2, the sequence is 11.
 * 
 * 
 * 
 * @author srajeev
 *
 */
public class CountAndSay {

	static String countAndSay(int a) {
		if (a == 1)
			return "1";
		if (a == 2)
			return "11";
		String prev = "11";
		for (int i = 3; i <= a; i++) {
			int cnt = 1;
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j < prev.length(); j++) {
				if (prev.charAt(j) == prev.charAt(j - 1)) {
					cnt++;
					if (j == prev.length() - 1) {
						sb.append(cnt).append(prev.charAt(j - 1));
						cnt = 1;
					}
				} else {
					sb.append(cnt).append(prev.charAt(j - 1));
					if (j == prev.length() - 1) {
						sb.append(1).append(prev.charAt(j));
					}
					cnt = 1;
				}
			}
			prev = sb.toString();
		}

		return prev;
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(8));
	}
}
