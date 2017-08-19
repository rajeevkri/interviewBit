package com.interviewBit.stack;

public class ReverseString {

	static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		int n =charArray.length;
		for(int i = n-1; i>=0;i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("rajeev"));
	}
}
