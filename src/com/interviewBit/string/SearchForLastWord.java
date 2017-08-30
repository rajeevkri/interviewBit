package com.interviewBit.string;

public class SearchForLastWord {
	public static int lengthOfLastWord(String a) {
		if(a== null || a.length() == 0) {
			return 0;
		}
		a = a.trim();
		int l = a.lastIndexOf(" ");
		if(l < 0) {
			return a.length();
		}
		return a.length() - l -1;
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello world"));
	}
}
