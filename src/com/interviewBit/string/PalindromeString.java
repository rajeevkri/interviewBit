package com.interviewBit.string;

public class PalindromeString {
	public static int isPalindrome(String a) {
		int isP = 1;
		if(a == null || a.length() == 0) {
			return isP;
		}
		a = a.toLowerCase();
		int n = a.length();
		int i = 0, j = n - 1;
		while (i < j) {
			if (a.charAt(i) == a.charAt(j)) {
				j--;
				i++;
				continue;
			}
			boolean b = false;
			if (!((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))) {
				i++;
				b = true;
			}
			if (!((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))) {
				j--;
				b = true;
			}
			if (b)
				continue;
			if (a.charAt(i) != a.charAt(j)) {
				isP = 0;
				break;
			}
		}
		return isP;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("rac$1 1$ car"));
	}
}
