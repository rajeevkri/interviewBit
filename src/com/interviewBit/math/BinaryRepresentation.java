package com.interviewBit.math;

public class BinaryRepresentation {
	public static String binaryRep(int a) {
		if(a == 0) {
			return String.valueOf(a);
		}
		StringBuilder binary = new StringBuilder();
		while (a>0) {
		    if((a&1)==1){
		        binary.append(1);
		    }else
		        binary.append(0);
		    a>>=1;
		}
		return binary.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(binaryRep(1024));
	}
}
