package com.interviewBit.array;

import java.util.ArrayList;
import java.util.Collections;

public class RotateMatrix {

	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		int r = a.size();
		int c = a.get(0).size();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<c;i++) {
			ArrayList<Integer> iList = new ArrayList<>();
			for(int j =0; j< r; j++) {
				iList.add(0);
			}
			result.add(iList);
		}
		for(int j = 0; j<=c-1 ; j++) {
			ArrayList<Integer> iList = result.get(j);
			for(int i = r-1; i>=0;i--) {
				iList.set(r-i-1,a.get(i).get(j));
			}
		}
		
		Collections.copy(a, result);
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> iList1 = new ArrayList<>();
		iList1.add(1);
		iList1.add(2);
		a.add(iList1);
		ArrayList<Integer> iList2 = new ArrayList<>();
		iList2.add(3);
		iList2.add(4);
		a.add(iList2);
		rotate(a);
		System.out.println(a);
	}
}
