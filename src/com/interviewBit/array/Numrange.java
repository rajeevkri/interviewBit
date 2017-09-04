package com.interviewBit.array;

import java.util.ArrayList;

/**
 * 
 * Given an array of non negative integers A, and a range (B, C), 
find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3 
as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

 * @author rajeev singh
 *
 */
public class Numrange {
	public int numRange(ArrayList<Integer> a, int b, int c) {
		int counter =0;
	    int result =0;
	    for(int i =0; i< a.size(); i++){
	            result = a.get(i);
	            if( result >= b && result <= c){
	                counter++;
	            }
	            int k =i+1;
	            while(k< a.size()){
	                result = result+ a.get(k);
	                if( result >= b && result <= c){
	                    counter++;
	                }
	                else if( result >c){
	                    break;
	                }
	                k++;
	            }
	    }
	    return counter;
	}

}
