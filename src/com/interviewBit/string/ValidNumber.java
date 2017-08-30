package com.interviewBit.string;

public class ValidNumber {

	public static void main(String[] args) {
		System.out.println(isNumber1(" 3."));
	}

	public static int isNumber(final String a) {
		return (a.matches("\\s*[\\-\\+]?([0-9]*\\.?)?[0-9]+(e[\\-\\+]?[0-9]+)?\\s*")) ? 1 : 0;
	}
	
	public static boolean isNumber1(String s) {
		
        return (s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)")) ? true : false;
    }
}
