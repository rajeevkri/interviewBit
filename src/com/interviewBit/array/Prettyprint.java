package com.interviewBit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print concentric rectangular pattern in a 2d matrix. 
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
Example 2:

Input: A = 3.
Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.

 * @author rajeevsingh
 *
 */
public class Prettyprint {
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		int size = 2*a - 1;
		ArrayList<ArrayList<Integer>> intList = new ArrayList<ArrayList<Integer>>();
		Integer [][]arr = new Integer[size][size];
		int n = a;
		
		//Fill first quarter
		for(int i =0 ;i<a ; i++) {
			for(int j =0 ;j<a ; j++) {
				if(i>=j) {
					arr[i][j] = n-j;
				} else {
					arr[i][j] = n-i;
				}
			}
		}
		
		//taking mirror image of arr to second quarter
		for (int i = 0; i < a; ++i)				
	    {
	        for (int j = size - 1; j >= a; --j)
	        {
				arr[i][j] = arr[i][size - 1 - j];
			}
		}
		
		for (int i = a; i < size; i++)				
	    {
	        for (int j = 0; j <size; j++)
	        {
				arr[i][j] = arr[size - 1 - i][size - 1 - j];
			}
		}
		intList = twoDArrayToList(arr);
		
		return intList;
	}
	
	public static ArrayList<ArrayList<Integer>> twoDArrayToList(Integer[][] arr) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int r = arr.length;
		
		for(int i=0;i<r;i++) {
			ArrayList<Integer> iList = new ArrayList<Integer>();
			for(int j=0;j<r;j++) {
				iList.add(arr[i][j]);
			}
			list.add(iList);
		}
			
	    return list;
	}
	
	public static void main(String[] args) {
		prettyPrint(3);
		System.out.println("test");
	}
}
