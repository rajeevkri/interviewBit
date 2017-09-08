package com.interviewBit.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * @author srajeev
 *
 */
public class ImplementStrStr {
	public static int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;
		if (needle.length() == 0 || needle.equals(haystack)) {
			return 0;
		}
		if(haystack.length() == 0) 
			return -1;
		int nl = haystack.length();
		int hl = needle.length();
		int i = 0, j = 0;
		boolean isStart = false;
		int start = -1;

		while (i < nl && j < hl) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				if (!isStart) {
					isStart = true;
					start = i;
				}
				i++;
				j++;
			} else if (isStart) {
				isStart = false;
				j = 0;
				i = start + 1;
				start = -1;
			} else {
				i++;
			}
		}
		if(j!= hl)
			return -1;
		return start;
	}

	public static void main(String[] args) {
		System.out.println(strStr("bbbbbbbbab", "baba"));
	}
}
