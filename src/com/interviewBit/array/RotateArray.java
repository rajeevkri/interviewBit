package com.interviewBit.array;

import java.util.ArrayList;

public class RotateArray {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int index = B;
		int length = A.size();
		for (int i = 0; i < length; i++) {
			while (index >= length) {
				index = index - length;
			}
			ret.add(A.get(index++));
		}
		return ret;
	}
}
