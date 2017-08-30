package com.interviewBit.string;

public class ReverseString {
	public static String reverseString(String s) {
		String a = s;
		if(a == null || a.trim().length() ==0) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		a = a.trim();
		char []cArr = a.toCharArray();
		int n = a.length();
		for(int i = n-1; i>=0;i--) {
			sb.append(cArr[i]);
		}
		return sb.toString();
	}
	
	public static String reverseWords(String a) {
		if(a == null || a.trim().length() ==0) {
			return a;
		}
		StringBuilder sb = new StringBuilder();
		String[] sArr = a.split(" ");
		int n = sArr.length;
		for(int i = n-1; i>=0;i--) {
			sb.append(sArr[i]);
			if(i!= 0)
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		//System.out.println(reverseString("Hello"));
		System.out.println(reverseWords("fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq"));
	}
}
